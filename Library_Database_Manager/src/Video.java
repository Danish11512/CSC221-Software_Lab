//Danish Faruqi
import java.util.Date;

public class Video extends MultiMediaItem {

    private String director;

//    Constructor
    Video(String id, String title, Date addedOn, int playingTime, String director)
    {
        super(id, title, addedOn, playingTime);
        this.director = director;
    }

//    Get/Set Functions
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String listAsString() {
        return "ID: " + getId()+ "\t \t Video Title: " + getTitle() + "\t \t" + "Added On: " + getAddedOn() + "\t \t" + "Playing Time: " + getPlayingTime() + "secs \t \t" + "Director: " + getDirector();
    }
}
