package CreationPatterns.AbstractFactoryPattern;

public class FurnitureImplement implements Furniture{

    Chair chairs;
    Table tables;
    Sofa sofa;
    public FurnitureImplement(Chair chair, Table table, Sofa sofa){
        this.chairs = chair;
        this.sofa = sofa;
        this.tables = table;
    }


    @Override
    public void displayChair() {
        chairs.talkLikeAchair();
    }

    @Override
    public void displayTable() {
        tables.talkLikeATable();
    }

    @Override
    public void displaySofa() {
        sofa.talkLikeASofa();
    }
}
