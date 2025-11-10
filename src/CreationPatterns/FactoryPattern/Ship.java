package CreationPatterns.FactoryPattern;

public class Ship implements Logistics{

    @Override
    public void send(){
        System.out.println("Send by Ship");
    }
}
