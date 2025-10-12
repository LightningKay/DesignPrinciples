package BehvioralPatterns;

interface Strategy{
    void match(String location);
}

class AirportStrategy implements Strategy{
    public void match(String location){
        System.out.println("Going to Location "+ location + " with strategy Airport");
    }
}

class SurgeStrategy implements Strategy{
    public void match(String location){
        System.out.println("Going to Location "+ location + " with strategy Surge");
    }
}

class QueueStrategy implements Strategy{
    public void match(String location){
        System.out.println("Going to Location "+ location + " with strategy Queue");
    }
}

class RideMatchingService1{
    Strategy strat;
    public RideMatchingService1(Strategy strat){
        this.strat = strat;
    }

    public void match(String location){
        strat.match(location);
    }
}

public class WithStrategyPattern {

    public static void main(String[] args) {
        RideMatchingService1 rideMatchingService1 = new RideMatchingService1(new AirportStrategy());
        rideMatchingService1.match("SFO");
    }
}
