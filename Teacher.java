import java.io.Serializable;

public class Teacher implements Serializable {

    private String name;
    private int yearsOfExperience;

    public Teacher(String name, int yearsOfExperience){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;

    }
    public String getName(){

        return name;

    }
    public int getYearsOfExperience(){

        return yearsOfExperience;

    }
    public void setName(String name){

        this.name = name;

    }
    public void setYearsOfExperience(int years){

        this.yearsOfExperience = years;

    }
    public String toString(){

        return name;

    }
}
