//Danish Faruqi
import java.util.Date;

public abstract class Item implements Comparable<Item>{

    private String id;
    private String title;
    private Date addedOn;

    //Contructor
//    Item(){
//        id = "";
//        title = "";
//
//
//    }

    Item(String id, String title, Date addedOn)
    {
        this.id = id;
        this.title = title;
        this.addedOn = addedOn;
    }
//    Get/Set Methods


    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //For ID comparison
    public int compareTo(Item item) {
        return this.getId().compareTo(item.getId());
    }

    public String listAsString(){
        return "ID: " + getId() + "\t \t" + "Title: " + getTitle() + "\t \t" + "Added On: " + getAddedOn()+ "\t \t";
    }
}
