import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    private String name;
    private Course bestClass;
    private ArrayList<Course> classes;
    private int grade;
    private int gradeLevel;
    private static double GPA;

    public Student(String name, int gradeLevel){

        this.name = name;
        this.gradeLevel = gradeLevel;
        grade = -1;
        GPA = 0.0;
        bestClass();
        classes = new ArrayList<>();

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
    public int getGrade(){

        return grade;

    }
    public void setGrade(int grade){

        this.grade = grade;

    }
    public String listStudentClasses(){

        if(classes.size() != 0){

            for(int i = 0; i < classes.size(); i++){

                return i + ") "+ classes.get(i);

            }
        }else{

            return "No classes";

        }
        return "No Classes";
    }
    public void setName(String name){

        this.name = name;

    }
    public void setGradeLevel(int level){

        this.gradeLevel = level;

    }
    public void calculateGPA(){

        double total = 0.0;

        for(int i = 0;i < classes.size();i++){

            if (classes.get(i).getGrade() >= 0 && classes.get(i).getGrade() <= 100){

                if(classes.get(i).getGrade() >= 90){

                    total += 4.0;

                }
                else if(classes.get(i).getGrade() >= 80 && classes.get(i).getGrade() < 90){

                    total += 3.0;

                }
                else if(classes.get(i).getGrade() >= 70 && classes.get(i).getGrade() < 80){

                    total += 3.0;

                }
                else if(classes.get(i).getGrade() >= 60 && classes.get(i).getGrade() < 70){

                    total += 2.0;

                }
                else if(classes.get(i).getGrade() >= 50 && classes.get(i).getGrade() < 60){

                    total += 1.0;

                }
                
                GPA = total / classes.size();

            }
        }
    }
    public void bestClass(){

        Course bestClass = classes.get(0);

        for(int i =0; i < classes.size();i++){

            if(classes.get(i).getGrade() > bestClass.getGrade()){

                bestClass = classes.get(i);

            }
        }
        this.bestClass = bestClass;

    }
    public void addCourse(Course c){


        classes.add(c);

    }
    public void removeCourse(int index){

        classes.remove(index);

    }
    public String toString(){

        return "Name: " + name + "\nGrade Level: " + gradeLevel + "\nGPA: " + GPA + "\nBest Class: " + bestClass;

    }
    
}
