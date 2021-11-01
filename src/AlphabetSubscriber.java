import java.io.FileWriter;
import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber{

    public AlphabetSubscriber(){
        super("alphabet");
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {}

    @Override
    public void onNext(String item) {
        System.out.println("+added to Alphabet");
        this.writeFile(item);
    }

    @Override
    public boolean checkMatch(String item) {
        return item.matches(".*[a-zA-Z].*");
    }
}
