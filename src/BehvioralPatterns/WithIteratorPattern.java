package BehvioralPatterns;
import java.util.*;


class Video1{
    String name;
    static long videoInc = 1l;
    long currVideoId;

    public Video1(String name){
        this.name = name;
        this.currVideoId = videoInc++;
    }

    public long getVideoId(){
        return currVideoId;
    }
}

interface PlaylistIterator{
    boolean hasNext();
    Video1 next();
}

class VideoIterator implements PlaylistIterator{

    List<Video1> playlist;

    int count;
    public VideoIterator(List<Video1> playlist){
        this.playlist = playlist;
    }

    public boolean hasNext(){
        return count != playlist.size();
    }

    public Video1 next(){
        return hasNext() ? playlist.get(count++) : null;
    }
}

class VideoPlaylist1{
    String playlistName;
    private List<Video1> videos;

    public VideoPlaylist1(String playlistName){
        this.playlistName = playlistName;
        videos = new ArrayList<>();
    }

    public void addVideo(Video1 v){
        videos.add(v);
    }

    public VideoIterator iterator(){
        return new VideoIterator(videos);
    }
}
public class WithIteratorPattern {

    public static void main(String[] args) {
        Video1 v1 = new Video1("v1");
        Video1 v2 = new Video1("v2");
        Video1 v3 = new Video1("v3");
        Video1 v4 = new Video1("v4");

        VideoPlaylist1 playlist = new VideoPlaylist1("My playlist");
        playlist.addVideo(v1);
        playlist.addVideo(v2);
        playlist.addVideo(v3);
        playlist.addVideo(v4);

        VideoIterator iter = playlist.iterator();

        while(iter.hasNext()){
            Video1 v = iter.next();
            System.out.println(v.getVideoId());
        }

    }
}
