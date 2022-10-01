import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable{

    private String subject, teacher;
    private int grade;
    private boolean current;

    public Course(String subject, String teacher){
        this.subject = subject;
        this.teacher = teacher;
        grade = -1;
        current = false;

    }
    public Course(String subject, String teacher, int grade, boolean current){
        this.subject = subject;
        this.teacher = teacher;
        this.grade = grade;
        this.current = current;

    }
    public String toString(){

        if (grade >= 0){

            return subject + " by " + teacher + "with a " + grade;

        }
        return subject + " by " + teacher;


    }
    
}
