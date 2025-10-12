package StructuralPatterns;

import java.util.HashMap;

interface VideoDownloader1{
    String downloadVideo(String videoUrl);
}

class DownloadVideo implements VideoDownloader1{
    public DownloadVideo(){
    }
    public String downloadVideo(String name){

        System.out.println("Downloading Video - " + name);
        String returnVideo =  "Downloaded Video - " + name;
        return returnVideo;
    }
}

class CachedDownloadVideo implements VideoDownloader1{

    HashMap<String, String> cache;
    public CachedDownloadVideo(){
        cache = new HashMap<>();
    }


    @Override
    public String downloadVideo(String videoUrl) {
        if(cache.containsKey(videoUrl)){
            System.out.println("Downloading from cache");
            return cache.get(videoUrl);
        }

        DownloadVideo downloadVideo = new DownloadVideo();
        String video =  downloadVideo.downloadVideo(videoUrl);
        cache.put(videoUrl, video);
        return video;
    }
}

class SingletonFactory1{

    static CachedDownloadVideo cachedDownloadVideo;

    public static CachedDownloadVideo getCachedDownloadVideo(){
        if(cachedDownloadVideo == null){
            cachedDownloadVideo = new CachedDownloadVideo();
            return cachedDownloadVideo;
        }

        return cachedDownloadVideo;
    }
}
public class WithProxyPattern {
    public static void main(String[] args) {
        VideoDownloader1 videoDownloader1 = SingletonFactory1.getCachedDownloadVideo();
        videoDownloader1.downloadVideo("Video 1");

        VideoDownloader1 videoDownloader2 = SingletonFactory1.getCachedDownloadVideo();
        System.out.println(videoDownloader1 + " " + videoDownloader2);
        videoDownloader2.downloadVideo("Video 1");
    }
}
