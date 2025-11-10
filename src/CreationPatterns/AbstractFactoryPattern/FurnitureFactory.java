package CreationPatterns.AbstractFactoryPattern;

public class FurnitureFactory {

    public static  FurnitureImplement getVictorian(){
        return new FurnitureImplement(new VictorianChair(), new VictorianTable(), new VictorianSofa());
    }

    public static  FurnitureImplement getModern(){
        return new FurnitureImplement(new ModernChair(), new ModernTable(), new ModernSofa());
    }
}
