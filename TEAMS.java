import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS{

    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);

    //MENUS
    public static void menuOne(){

        System.out.println("####WELCOME TO TEAMS####");
        System.out.println("1) Add Student");
        System.out.println("2) Add Teacher");
        System.out.println("3) Add Course");
        System.out.println("4) Edit Student");
        System.out.println("5) List Students");
        System.out.println("6) List Courses");
        System.out.println("7) Search For Student");
        System.out.println("-1) Exit");

    }

    //GETTERS && SETTERS
    public static void addStudent(Student s){

        students.add(s);

    }
    public static void addTeacher(Teacher t){

        teachers.add(t);

    }
    public static void addCourse(Course c){

        courses.add(c);

    }
    public static void editStudent(){

        listStudents();
        System.out.println("Student Index: ");
        int index = sc.nextInt();

        System.out.println("What do you want to change?");
        System.out.println("1) Name");
        System.out.println("2) Grade Level");
        System.out.println("3) Add Course");
        System.out.println("4) Remove Course");

        int ans = sc.nextInt();

        if(ans == 1){

            System.out.println("New Name: ");
            String name = sc.nextLine();
            sc.nextLine();

            students.get(index).setName(name);

        }
        else if(ans == 2){

            System.out.println("New Grade Level: ");
            int gradeLevel = sc.nextInt();
            sc.nextLine();

            students.get(index).setGradeLevel(gradeLevel);

        }
        else if(ans == 3){

            int course;
            
            listCourses();

            System.out.println("Which Course: ");
            course = sc.nextInt();
            sc.nextLine();

            students.get(index).addCourse(courses.get(course).clone());

            System.out.println("Student Grade: ");
            int grade = sc.nextInt();
            sc.nextLine();

            courses.get(course).setGrade(grade);

            System.out.println("Currently Taking? (y/n): ");
            String current = sc.nextLine();

            boolean yn = false;
            if (current == "y"){

                yn = true;

            }else if(current == "n"){

                yn = false;

            }
            

        }
        else if(ans == 4){

            students.get(index).listStudentClasses();

            System.out.println("Which Course: ");
            int course = sc.nextInt();
            sc.nextLine();

            students.get(index).removeCourse(course);
            
        }
    }
    public static void listStudents(){

        for (int i = 0; i < students.size();i++){

            System.out.println(i + ") " + students.get(i));

        }
    }
    public static void listCourses(){

        for(int i = 0; i < courses.size(); i++){

            System.out.println(i + ") " + courses.get(i).getName() + " by " +  courses.get(i).getTeacher());

        }
    }
    public static void listTeachers(){

        for(int i = 0; i < teachers.size(); i++){

            System.out.println(i + ") " + teachers.get(i));

        }
    }

    public static void main(String[] args) {
        
        //Load the data if available ### DO NOT CHANGE THIS PART
        try{
            students =(ArrayList<Student>)loadData("students");

        }catch(Exception e){
            students = new ArrayList<>();
        }
        try{
            teachers =(ArrayList<Teacher>)loadData("teachers");
        }catch(Exception e){
            teachers = new ArrayList<>();
        }
        try{
            courses =(ArrayList<Course>)loadData("courses");
        }catch(Exception e){
            courses = new ArrayList<>();
        }

        //############## MAIN MENU STARTS HERE ##############
        int ans = 0;

        while(ans != -1){
            
            TEAMS.menuOne();
            ans = sc.nextInt();

            if(ans == 1){

                int gradeLevel;
                String name;

                System.out.println("Student Grade Level: ");
                gradeLevel = sc.nextInt();
                sc.nextLine();

                System.out.println("Student Name: ");
                name = sc.nextLine();
                
                addStudent(new Student(name, gradeLevel));

            }
            else if(ans == 2){

                int yearsOfExperience;
                String name;

                System.out.println("Years of Experience: ");
                yearsOfExperience = sc.nextInt();
                sc.nextLine();

                System.out.println("Teacher Name: ");
                name = sc.nextLine();

                addTeacher(new Teacher(name, yearsOfExperience));

            }
            else if(ans == 3){

                listTeachers();
                
                System.out.println("Teacher: ");
                int teacher = sc.nextInt();
                sc.nextLine();

                System.out.println("Subject Name: ");
                String subject = sc.nextLine();

                addCourse(new Course(subject,teachers.get(teacher)));
                
            }
            else if(ans == 4){

                editStudent();
                
            }
            else if(ans == 5){

                listStudents();
                
            }
            else if(ans == 6){

                listCourses();
                
            }
            else if(ans == 7){

                System.out.println("Student Name: ");
                String name = sc.nextLine();
                sc.nextLine();

                for(int i = 0; i < students.size(); i++){

                    if(students.get(i).getName() == name){

                        System.out.print(students.get(i));

                    }
                    else{

                        System.out.println("No student found.");
                        
                    }
                }
            }
            else if(ans == -1){

                try{
                     
                    saveData();
                    
                }catch(Exception e){}
                
            }
        } 
    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData()throws Exception{
        FileOutputStream f1 = new FileOutputStream("students");
        ObjectOutputStream os = new ObjectOutputStream(f1);
        os.writeObject(students);
        os.close();
        f1.close();

        FileOutputStream f2 = new FileOutputStream("courses");
        os = new ObjectOutputStream(f2);
        os.writeObject(courses);
        os.close();
        f2.close();

        FileOutputStream f3 = new FileOutputStream("teachers");
        os = new ObjectOutputStream(f3);
        os.writeObject(teachers);
        os.close();
        f3.close();
    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception{
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new  ObjectInputStream(fis);   
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }

}
