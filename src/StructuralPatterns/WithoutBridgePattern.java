package StructuralPatterns;

interface PlayQuality{
    void play(String title);
}

class WebHDPlayer implements PlayQuality{
    String title;
    public WebHDPlayer(String title){
        this.title = title;
    }

    public void play(String title){
        System.out.println("Web Player Playing " + title + " in HD quality");
    }
}

class MobileHDPlayer implements PlayQuality{
    String title;
    public MobileHDPlayer(String title){
        this.title = title;
    }

    public void play(String title){
        System.out.println("Mobile Playing " + title + " in HD quality");
    }
}

class SmartTvHDPlayer implements PlayQuality{
    String title;
    public SmartTvHDPlayer(String title){
        this.title = title;
    }

    public void play(String title){
        System.out.println("SmartTvHDPlayer Playing " + title + " in 4K quality");
    }
}

public class WithoutBridgePattern {

    public static void main(String[] args) {
        PlayQuality play = new WebHDPlayer("Star Wars");
        play.play("Star wars");

    }
}
