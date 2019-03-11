//Danish Faruqi
import java.util.Comparator;
public class sortByDirector implements Comparator<Item>{

        public int compare(Item one, Item two) {
            if (one instanceof Video && two instanceof Video) {
                return ((Video) one).getDirector().compareTo(((Video) two).getDirector());
            }
            return 0;
        }
}
