//Danish Faruqi
import java.util.ArrayList;

public class Database{

    //Intstance field
    private ArrayList<Item> item;

//    Contructor
    Database(){
        item = new ArrayList<>();
    }

//    Add method
    public void addItem(Item item){
        this.item.add(item);
    }

    public void list(){
        for(Item compare: item){
            System.out.println(compare.listAsString());
        }
    }

    //    Get/Set functions
    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

}
