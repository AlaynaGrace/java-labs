/**
 * Created by alayn on 11/29/2016.
 */
public class UMNStudent {
    private long id;
    public String firstName;
    public String lastName;
    private String[] classes;
    private String advisor;
    public String major;

    public UMNStudent(long id, String first, String last, String[] classList, String advisor, String major){
        this.id = id;
        firstName = first;
        lastName = last;
        classes = classList;
        this.advisor = advisor;
        this.major = major;
    }
    public void setId(long newID){
        id = newID;
    }
    public void setFirstName(String newFirst){
        firstName = newFirst;
    }
    public void setLastName(String newLast){
        lastName = newLast;
    }
    public void setClasses(String[] newClasses){
        classes = newClasses;
    }
    public void setAdvisor(String newAdvisor){
        advisor = newAdvisor;
    }
    public void setMajor(String newMajor){
        major = newMajor;
    }
    public long getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String[] getClasses(){
        return classes;
    }
    public String getAdvisor(){
        return advisor;
    }
    public String getMajor(){
        return major;
    }

}
