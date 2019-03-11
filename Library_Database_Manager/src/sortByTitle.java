//Danish Faruqi
import java.util.Comparator;
public class sortByTitle implements Comparator<Item> {

    public int compare(Item one, Item two){
        return one.getTitle().compareTo(two.getTitle());
    }
}
