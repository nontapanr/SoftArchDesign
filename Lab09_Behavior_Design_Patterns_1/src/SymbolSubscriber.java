import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber{

    public SymbolSubscriber() {
        super("symbol");
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {}

    @Override
    public void onNext(String item) {
        System.out.println("+added to Symbol");
        this.writeFile(item);
    }

    @Override
    public boolean checkMatch(String item) {
        return item.matches(".*[!-/:-@\\[-`{-~].*");
    }
}
