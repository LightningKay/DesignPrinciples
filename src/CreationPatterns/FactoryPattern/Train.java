package CreationPatterns.FactoryPattern;

public class Train implements Logistics{

    @Override
    public void send(){
        System.out.println("Send by Train");
    }
}
