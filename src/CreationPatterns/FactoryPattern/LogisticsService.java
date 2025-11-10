package CreationPatterns.FactoryPattern;

public class LogisticsService {

    public void send(String mode){
        Logistics logistic = LogisticFactory.getInstance(mode);
        logistic.send();
    }

    public static void main(String[] args) {
        LogisticsService src = new LogisticsService();
        src.send("TRAIN");
    }
}
