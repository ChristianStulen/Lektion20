import java.util.Calendar;

public class Person {

    //Instansvariabler/attribut/egenskaper
    private String firstName;
    private String lastName;

    public String getFirstName() {
        if (this.firstName == null) return "Guest";
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null)
        this.firstName = firstName;
        else
            throw new NullPointerException();
    }

    public String getLastName() {
        if (this.lastName == null) return "Guest";
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null)
        this.lastName = lastName;
        else
            throw new NullPointerException();
    }

    public void setName(String firstName, String lastName){
        if(firstName != null && lastName !=null){
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
    public String toString(){
        return getFirstName() + " " + getLastName();
    }

}
