package sample;

public class Contact {

    private String fname;
    private String lname;
    private String email;
    private String phonenumber;
    private String picturepath;

    //Constructor
    Contact(String fname, String lname, String email, String phonenumber, String picturepath) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.picturepath = picturepath;
    }

    Contact(String lname){
        this.lname = lname;
    }

    // Get/Set methods


    public String getEmail() {
        return email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath;
    }

    public int compareThem(Contact another){
        return this.getLname().compareTo(another.getLname());

    }

}
