package StructuralPatterns;


import java.util.*;

class TreeProp{
    String name;
    String texture;
    String color;

    public TreeProp(String name, String texture, String color){
        this.name = name;
        this.texture = texture;
        this.color = color;
    }
}
class Tree{
    int x;
    int y;

    TreeProp prop;

    public Tree(int x, int y, TreeProp prop){
        this.x = x;
        this.y = y;
        this.prop = prop;
    }

    public void printTree(){
        System.out.println("Tree is at " + x + ":" + y + " properties are " + prop.name + " " + prop.texture + " " + prop.color);
    }
}


class TreeFactory{

    static Map<String, TreeProp> treeTypeMap = new HashMap<>();

    public static TreeProp getTreeType(String name, String texture, String color) {
        String key = name + " - " + color + " - " + texture;

        if (!treeTypeMap.containsKey(key)) {
            treeTypeMap.put(key, new TreeProp(name, color, texture));
        }
        return treeTypeMap.get(key);
    }
}
public class WithoutFlyWeightPattern {
    public static void main(String[] args) {
        for(int i = 0; i < 1000000; i++){
            Tree newTree = new Tree(i, i, TreeFactory.getTreeType("Karthik", "bold", "black"));
            newTree.printTree();
        }
    }
}
