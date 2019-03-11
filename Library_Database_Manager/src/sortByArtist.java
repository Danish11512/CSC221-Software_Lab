//Danish Faruqi
import java.util.Comparator;
public class sortByArtist implements Comparator<Item>{

    public int compare(Item one, Item two) {
        if (one instanceof CD && two instanceof CD) {
            return ((CD) one).getArtist().compareTo(((CD) two).getArtist());
        }
        return 0;
    }
}