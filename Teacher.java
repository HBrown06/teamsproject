import java.io.Serializable;
import java.util.ArrayList;

public class Teacher implements Serializable {

    private String name;
    private int yearsOfExperience;
    private ArrayList<Course> classes;

    public Teacher(String Name, int yearsOfExperience){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;

    }
    public void addCourse(Course c){

        classes.add(c);

    }
    public void removeCourse(int index){

        classes.remove(index);
        
    }
    
}
