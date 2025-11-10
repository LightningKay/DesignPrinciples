package CreationPatterns.AbstractFactoryPattern;

public class FurnitureService {

    public void display(FurnitureImplement furniture){
        furniture.displayChair();
        furniture.displaySofa();
        furniture.displayTable();
    }
    public static void main(String[] args) {
        FurnitureImplement victorianFurniture = FurnitureFactory.getVictorian();
        FurnitureImplement modernFurniture = FurnitureFactory.getModern();

        FurnitureService furnitureService = new FurnitureService();

        furnitureService.display(victorianFurniture);
        furnitureService.display(modernFurniture);
    }
}
