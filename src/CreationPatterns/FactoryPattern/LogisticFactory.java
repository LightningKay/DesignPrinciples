package CreationPatterns.FactoryPattern;

public class LogisticFactory {

    private LogisticFactory(){

    }
    public static Logistics getInstance(String method){
        if(method.equals("AIR")){
            return new Air();
        }else if(method.equals("SHIP")){
            return new Ship();
        }else{
            return new Train();
        }
    }
}
