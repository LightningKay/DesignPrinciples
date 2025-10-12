package BehvioralPatterns;



class Video2{
    String name;

    static long videoId = 1l;

    long currVideoId;

    public Video2(String name){
        this.name = name;
        this.currVideoId = videoId++;
    }
}
class YoutubeVideos{
    public void uploadVideo(Video2 video){
        System.out.println("Upladed the video " + video.currVideoId + " " + video.name);

        System.out.println("Sending out notification");
    }
}
public class WithoutObserverPattern {

    public static void main(String[] args) {
        Video2 v1 = new Video2("Star Wars");
        YoutubeVideos yt = new YoutubeVideos();
        yt.uploadVideo(v1);
    }
}
