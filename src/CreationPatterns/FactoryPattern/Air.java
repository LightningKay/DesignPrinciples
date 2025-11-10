package CreationPatterns.FactoryPattern;

public class Air implements Logistics{

    @Override
    public void send(){
        System.out.println("Send by Air");
    }
}
