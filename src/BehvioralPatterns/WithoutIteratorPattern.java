package BehvioralPatterns;

import java.util.*;

 class Video {
    String name;
    static long videoId = 1L;
    long currVideoId;
    public Video(String name){
        this.name = name;
        this.currVideoId = videoId++;
    }

    public String getName(){
        return name;
    }

    public long getVideoId(){
        return currVideoId;
    }
}

class VideoPlaylist{
    String playlistName;
    List<Video> playlist;

    public VideoPlaylist(String playlistName){
        this.playlistName = playlistName;
        playlist = new ArrayList<>();
    }

    public String getPlaylistName(){
        return playlistName;
    }

    public void addVideo(Video videoToAdd){
        this.playlist.add(videoToAdd);
    }
}
public class WithoutIteratorPattern {

    public static void main(String[] args) {
        Video v1 = new Video("video1");
        Video v2 = new Video("video2");
        Video v3 = new Video("video3");

        VideoPlaylist playlist = new VideoPlaylist("New playlist");
        playlist.addVideo(v1);
        playlist.addVideo(v2);
        playlist.addVideo(v3);

        for(Video v : playlist.playlist){
            System.out.println(v.getName() + " " + v.getVideoId());
        }


    }
}
