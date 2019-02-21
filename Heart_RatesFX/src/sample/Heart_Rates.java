//By Danish Faruqi CSC 22100 - R

package sample;
import java.util.Calendar;

public class Heart_Rates {

    // All the attributes

    // first and last name
    private String First_name;
    private String Last_name;

    // birth date
    private int bday;
    private int bmonth;
    private int byear;

    // constructor that takes in all the information
    public Heart_Rates(String fname, String lname, int day, int month, int year){

        // set all attributes
        this.First_name = fname;
        Last_name = lname;
        bday = day;
        bmonth = month;
        byear = year;
    }

    // Get and Set methods for all attributes
    public String getFirst_name(){
        return First_name;
    }

    public String getLast_name(){
        return Last_name;
    }

    public int getBday(){
        return bday;
    }

    public int getBmonth(){
        return bmonth;
    }

    public int getByear(){
        return byear;
    }

    public String printBirthDate(){
        String ans =  bmonth + "/" + bday + "/" + byear;
        return ans;
    }

    public void setFirst_name(String ffname){
        First_name = ffname;
    }

    public void setLast_name(String llname){
        Last_name = llname;
    }

    public void setBday(int dday){
        bday = dday;
    }

    // Display an error if the date entered is wrong
    public boolean ErrorBday() {
        if (bday >31)
        {
            return false;
        }
        if (bday <1) {
            return false;
        }
        return true;
    }

    public void setBmonth(int mmonth){
        bmonth = mmonth;
    }

    // Display an error if the month entered is wrong
    public boolean ErrorBmonth() {
        if (bmonth >12 || bmonth < 1)
        {
            return false;
        }
        return true;
    }

    public void setByear(int yyear){
        byear = yyear;
    }

    // Display an error if the year entered is wrong
    public boolean ErrorByear() {
        if(byear >Calendar.getInstance().get(Calendar.YEAR))
        {
            return false;
        }
        return true;

    }


    // Method to calculate a person's age in years
    public int getAge(){
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        return currentyear-byear;
        // count precisely? like with months and all
    }

    // Method to calculate a person's maximum hear rate
    public int getMaxHeartRate()
    {
        // Max heart rate in bpm is 220- your age in years
        return 220-getAge();

    }

    // Method to calculate a person's target heart rate
    public String getTargetHeartRate()
    {
        // Target heart rate is 50-85% of your maximum heart rate
        double min = getMaxHeartRate() * 0.5;
        double max = getMaxHeartRate() * 0.85;

        int intmin = (int)min;
        int intmax = (int)max;

        String strmin = Integer.toString(intmin);
        String strmax = Integer.toString(intmax);

        return strmin + " - " + strmax + " bpm";
    }








}

