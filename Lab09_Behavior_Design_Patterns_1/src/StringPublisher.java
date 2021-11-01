import java.util.ArrayList;
import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher {
    private ArrayList<Flow.Subscriber> subscribers = new ArrayList();

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void publish(String item){
        for (Flow.Subscriber subscriber: subscribers)
            if (((StringSubscriber)subscriber).checkMatch(item)){
                subscriber.onNext(item);
            }
    }
}
