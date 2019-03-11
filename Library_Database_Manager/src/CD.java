//Danish Faruqi
import java.util.Date;

public class CD extends MultiMediaItem{

    private String artist;

//    Contructor
    CD(String id, String title, Date addedOn, int platingTime, String artist )
    {
        super(id, title, addedOn, platingTime);
        this.artist = artist;
    }

//    Get/Set Methods


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String listAsString() {
        return "ID: " + getId() + "\t \t" + "CD Title: " + getTitle() + "\t \t" + "Added On: " + getAddedOn() + "\t \t" + "Playing Time: " + getPlayingTime() + "\t \t" + " Artist: " + getArtist();
    }

//    @Override
//    public int compareTo(Item comp) {
//        return this.getArtist().compareTo(comp.getArtist());
//    }
}
