package BehvioralPatterns;

class RideMatchingService {
    public void rideMatch(String location, String strategy) {
        if("AIRPORT".equals(strategy)){
            System.out.println("Going to Location "+ location + " with strategy - " + strategy);
        }else if("SURGE".equals(strategy)){
            System.out.println("Going to Location "+ location + " with strategy - " + strategy);
        }else{
            System.out.println("Going to Location "+ location + " with strategy - " + strategy);
        }
    }

}
public class WithoutStrategyPattern {
    public static void main(String[] args) {
        RideMatchingService rideMatchingService = new RideMatchingService();
        rideMatchingService.rideMatch("SFO", "AIRPORT");
        rideMatchingService.rideMatch("SEATAC", "SURGE");

    }
}
