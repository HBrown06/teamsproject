import java.io.Serializable;

public class Course implements Serializable, Cloneable{

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
    public Course clone(){

        try{

            return (Course)super.clone();

        }catch(Exception e){
        }

        return null;

    }
    public String getTeacher(){

        return teacher;

    }
    public String getName(){

        return subject;

    }
    public String toString(){

        if (grade >= 0){

            return subject + " by " + teacher + "with a " + grade + ". Currently taking? " + current;

        }
        return subject + " by " + teacher + ". Currently taking? "+ current;


    }
    
}
