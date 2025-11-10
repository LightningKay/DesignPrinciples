package CreationPatterns.AbstractFactoryPattern;

public class CountryFactory {

    private CountryFactory(){

    }
    public static Country getInstance(String type){
        if(type.equals("INDIA")){
            return new Indiafactory();
        }else {
            return new USFactory();
        }
    }
}
