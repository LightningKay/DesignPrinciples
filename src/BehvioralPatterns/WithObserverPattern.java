package BehvioralPatterns;

import java.util.*;

class Video3{
    String name;

    public Video3(String name){
        this.name =  name;
    }
}

interface NotifySubscribers{
    void notifySubscribers();
}

interface Subscribers{
    void notif();
}
class YoutubeUpload{

    public YoutubeUpload(){
    }
    public void uploadVideo(Video3 video){
        System.out.println("Uploaded the video - " + video.name);
    }
}

class MobileSubscriber implements Subscribers{

    public void notif(){
        System.out.println("Mobile user notified");
    }
}

class WebSubscriber implements Subscribers{

    public void notif(){
        System.out.println("WebSubscriber user notified");
    }
}


class Newvideo implements NotifySubscribers{
    YoutubeUpload upload;
    List<Subscribers> subscribers;
    public Newvideo(List<Subscribers> subscribers){
        this.subscribers = subscribers;
        upload = new YoutubeUpload();
    }

    public void upload(Video3 v){
        upload.uploadVideo(v);
        notifySubscribers();
    }

    public void notifySubscribers(){
        for(Subscribers sub : this.subscribers){
            sub.notif();
        }
    }
}
public class WithObserverPattern {

    public static void main(String[] args) {
        Subscribers mobile = new MobileSubscriber();
        Subscribers webSubsciber = new WebSubscriber();

        Video3 newVideo = new Video3("Star wars");

        Newvideo newUploadService = new Newvideo(Arrays.asList(mobile, webSubsciber));
        newUploadService.upload(newVideo);
    }
}
