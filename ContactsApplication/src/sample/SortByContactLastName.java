package sample;

import java.util.Comparator;

public class SortByContactLastName implements Comparator<Contact> {
    @Override
    public int compare(Contact contact1, Contact contact2) {
        return contact1.getLname().compareToIgnoreCase(contact2.getLname());
    }
}
