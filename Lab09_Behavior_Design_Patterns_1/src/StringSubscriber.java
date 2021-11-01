import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String> {
    private Flow.Subscription subscription;
    private String filename;

    public StringSubscriber(String name){
        this.filename = name + ".txt";
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public abstract void onNext(String item);

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error: " + throwable.toString());
    }

    @Override
    public void onComplete() {
        System.out.println("Complete !!");
    }

    protected void writeFile(String item){
        try {
            FileWriter writer = new FileWriter(filename, true);
            PrintWriter printer = new PrintWriter(writer);
            printer.print(item + "\n");
            printer.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract boolean checkMatch(String item);
}
