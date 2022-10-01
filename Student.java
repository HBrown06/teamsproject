import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    private String name,  bestClass;
    private ArrayList<Course> classes;
    private int gradeLevel;
    private double GPA;

    public Student(String name, int gradeLevel, ArrayList<Course> classes){

        this.name = name;
        this.gradeLevel = gradeLevel;
        this.classes = classes;
        GPA = 0.0;
        bestClass = null;

    }
    //GETTERS AND SETTERS
    public String getName(){

        return name;

    }
    public int getGradeLevel(){

        return gradeLevel;

    }
    public void setName(String name){

        this.name = name;

    }
    public void setGradeLevel(int level){

        this.gradeLevel = level;

    }
    public double calculateGPA(){

        return GPA;

    }
    public String getBestClass(){

        return null;

    }
    public void addCourse(Course c){

        classes.add(c);

    }
    public void removeCourse(int index){

        classes.remove(index);

    }
    public String toString(){

        return "Name: " + name + "\nGrade Level: " + gradeLevel + "\nGPA: " + this.calculateGPA();

    }
    
}
