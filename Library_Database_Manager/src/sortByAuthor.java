//Danish Faruqi
import java.util.Comparator;
public class sortByAuthor implements Comparator<Item>{

    public int compare(Item one, Item two) {
        if (one instanceof Textbook && two instanceof Textbook) {
            return ((Textbook) one).getAuthor().compareTo(((Textbook) two).getAuthor());
        }
        return 0;
    }
}