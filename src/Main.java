public class Main {
    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();

        AlphabetSubscriber alphabetSubscriber = new AlphabetSubscriber();
        NumberSubscriber numberSubscriber = new NumberSubscriber();
        SymbolSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);

        String strArr[] = {"62010453", "CE_KMITL", "SummerOlympics2020", "Tokyo", "Japan",
                "23-07-2021", "8-08-2021", "HNY2022!!!", "THA.BKK", ".?$#@", "1234"};

        for (String item: strArr){
            System.out.println(item);
            publisher.publish(item);
        }
    }
}
