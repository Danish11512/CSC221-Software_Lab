//Danish Faruqi
import java.util.Comparator;
public class sortByAddedOn implements Comparator<Item> {

    public int compare(Item one, Item two){
        return one.getAddedOn().compareTo(two.getAddedOn());
    }
}