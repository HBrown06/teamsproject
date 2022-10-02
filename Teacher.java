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
    public String toString(){

        return name;

    }
}
