import java.io.Serializable;

public class Course implements Serializable, Cloneable{

    private String subject;
    private Teacher teacher;
    private int grade;
    private boolean current;

    public Course(String subject, Teacher teacher){

        this.subject = subject;
        this.teacher = teacher;
        grade = -1;
        current = true;

    }
    public Course(String subject, Teacher teacher, int grade, boolean current){
         
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
    public Teacher getTeacher(){

        return teacher;

    }
    public String getName(){

        return subject;

    }
    public int getGrade(){

        return grade;

    }
    public boolean getCurrent(){

        return current;

    }
    public void setTeacher(Teacher teacher){

        this.teacher = teacher;

    }
    public void setName(String subject){

        this.subject = subject;

    }
    public void setGrade(int grade){

        this.grade = grade;

    }
    public void setCurrent(boolean current){

        this.current = current;

    }
    public String toString(){

        if (grade >= 0){

            return subject + " by " + teacher + " with a " + grade + ". Currently taking? " + current;

        }
        return subject + " by " + teacher + ". Currently taking? "+ current;

    }
}