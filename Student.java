import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    private String name, bestClass;
    private static ArrayList<Course> classes;
    private int gradeLevel;
    private double GPA;

    public Student(String name, int gradeLevel){

        this.name = name;
        this.gradeLevel = gradeLevel;
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
    public double getGPA(){

        return GPA;

    }
    public void listStudentClasses(){

        if(classes != null){

            for(int i = 0; i < classes.size(); i++){

                System.out.println(i + ") "+ classes.get(i));

            }
        }else{

            System.out.println("No classes");

        }
        
    }
    public void setName(String name){

        this.name = name;

    }
    public void setGradeLevel(int level){

        this.gradeLevel = level;

    }
    public void calculateGPA(){

        

    }
    public String getBestClass(){

        return null;

    }
    public void addCourse(Course c){

        if (classes == null){

            classes = new ArrayList<>(1);

        }else{
            
            classes.add(c);
        
        }
    }
    public void removeCourse(int index){

        classes.remove(index);

    }
    public String toString(){

        return "Name: " + name + "\nGrade Level: " + gradeLevel + "\nGPA: " + GPA + "\nBest Class: " + bestClass;

    }
    
}
