import java.io.Serializable;

public class Student implements Serializable {

    private String name, courses, bestClass;
    private int gradeLevel;
    private double GPA;

    public Student(String name, int gradeLevel, String courses){

        this.name = name;
        this.gradeLevel = gradeLevel;
        this.courses = courses;
        GPA = 0.0;
        bestClass = null;


    }

    public String getName(){

        return name;

    }
    public int getGradeLevel(){

        return gradeLevel;

    }
    public double calculateGPA(){

        return GPA;

    }
    public String getBestClass(){

        return null;

    }
    public void addCourse(int index){



    }
    public void removeCourse(int index){



    }
    public String toString(){

        return "Name: " + name + "\nGrade Level: " + gradeLevel + "\nGPA: " + this.calculateGPA();

    }
    
}
