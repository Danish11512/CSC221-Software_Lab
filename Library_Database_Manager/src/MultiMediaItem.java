//Danish Faruqi
import java.util.Date;

public abstract class MultiMediaItem extends Item{

    private int playingTime;

//    Constructor
    MultiMediaItem(String id, String title, Date addedOn, int playingTime)
    {
        super(id, title, addedOn);
        this.playingTime = playingTime;
    }

//    Get/Set methods


    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public String listAsString() {
        return super.toString() + "Playing Time: " + getPlayingTime();
    }
}
