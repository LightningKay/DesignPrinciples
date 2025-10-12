package StructuralPatterns;
import java.util.*;

class VideoDownloader{

    static HashMap<String, String> cache;
    public VideoDownloader(){
        cache = new HashMap<>();
    }
    public String downloadVideo(String name){

        if(cache.containsKey(name)){
            System.out.println("Returning from cache");
            return cache.get(name);
        }
        // caching logic


        System.out.println("Downloading Video - " + name);
        String returnVideo =  "Downloaded Video - " + name;
        cache.put(name, returnVideo);
        return returnVideo;
    }
}

class SingletonFactory{
    static VideoDownloader videoDownloader;

    public SingletonFactory(){

    }

    public static synchronized VideoDownloader getVideoDownloader() {
        if(videoDownloader == null){
            videoDownloader =  new VideoDownloader();
            return videoDownloader;
        }
        return videoDownloader;
    }
}
public class WithoutProxyPattern {

    public static void main(String[] args) {
        VideoDownloader downloader = SingletonFactory.getVideoDownloader();
        downloader.downloadVideo("new video");

        VideoDownloader downloaderCache= SingletonFactory.getVideoDownloader();
        downloaderCache.downloadVideo("new video");
    }
}
