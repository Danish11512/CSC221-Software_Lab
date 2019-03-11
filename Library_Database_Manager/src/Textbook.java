//Danish Faruqi
import java.util.Date;

public class Textbook extends Item{

    private String author;

//    Contructor
    Textbook(String id, String title, Date addedOn, String author){
        super(id, title, addedOn);
        this.author = author;
    }

//    Get/Set Functions
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    Overriden CompareTo function
//    @Override
//    public int compareTo(Textbook textbook) {
//        return this.author.compareTo(textbook.getAuthor());
//    }

    @Override
    public String listAsString() {
        return super.listAsString() + "Author: " + getAuthor() + "\t";
    }

}
