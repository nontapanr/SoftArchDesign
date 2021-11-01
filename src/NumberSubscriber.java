import java.util.concurrent.Flow;

public class NumberSubscriber extends StringSubscriber{
    public NumberSubscriber() {
        super("number");
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {}

    @Override
    public void onNext(String item) {
        System.out.println("+added to Number");
        this.writeFile(item);
    }

    @Override
    public boolean checkMatch(String item) {
        return item.matches(".*[0-9].*");
    }
}
