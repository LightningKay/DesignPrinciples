package StructuralPatterns;

interface PlayQuality1{
    void play(String title);
}

class HDPlayer implements PlayQuality1{

    public void play(String title){
        System.out.println("Playing " + title + " in HD quality");
    }
}
class K4Player implements PlayQuality1{

    public void play(String title){
        System.out.println("Playing " + title + " in 4K quality");
    }
}
class k8Player implements PlayQuality1{

    public void play(String title){
        System.out.println("Playing " + title + " in 8K quality");
    }
}

abstract class Player implements PlayQuality1{
    PlayQuality1 quality;
    public Player(PlayQuality1 quality){
        this.quality = quality;
    }
}

class WebPlayer extends Player{

    public WebPlayer(PlayQuality1 quality){
        super(quality);
    }
    public void play(String title){
        System.out.println("WebPlayer");
        quality.play(title);
    }
}

class MobilePlayer extends Player{

    public MobilePlayer(PlayQuality1 quality){
        super(quality);
    }
    public void play(String title){
        System.out.println("MobilePlayer");
        quality.play(title);
    }
}
class SmartTVPlayer extends Player{

    public SmartTVPlayer(PlayQuality1 quality){
        super(quality);
    }
    public void play(String title){
        System.out.println("SmartTVPlayer");
        quality.play(title);
    }
}
public class WithBridgePattern {

    public static void main(String[] args) {
        PlayQuality1 hdPlayer =  new HDPlayer();
        PlayQuality1 k4Player = new K4Player();
        SmartTVPlayer smartTv = new SmartTVPlayer(k4Player);
        smartTv.play("Wars");
    }
}
