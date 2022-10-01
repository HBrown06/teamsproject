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

                int gradeLevel, numCourses;
                String name;
                ArrayList<Course> classes = null;

                System.out.println("Student Name: ");
                name = sc.nextLine();

                System.out.println("Student Grade Level: ");
                gradeLevel = sc.nextInt();

                System.out.println("Number of Courses: ");
                numCourses = sc.nextInt();

                for(int i = 0; i < numCourses; i++){


                    System.out.println("Course Name: ");
                    String courseName = sc.nextLine();

                    System.out.println("Teacher: ");
                    String teacherName = sc.nextLine();

                    classes.add(new Course(courseName, teacherName));

                }

                addStudent(new Student(name, gradeLevel, classes));

            }
            else if(ans == 2){

                int yearsOfExperience;
                String name;
                ArrayList<Course> classes = null;



            }
            else if(ans == 3){


                
            }
            else if(ans == 4){


                
            }
            else if(ans == 5){


                
            }
            else if(ans == 6){


                
            }
            else if(ans == 7){


                
            }
            else if(ans == -1){

                System.exit(0);
                
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

    //MENUS
    public static void menuOne(){

        System.out.println("####WELCOME TO TEAMS####");
        System.out.println("1) Add Student");
        System.out.println("2) Add Teacher");
        System.out.println("3) Add Course");
        System.out.println("4) Edit Student");
        System.out.println("5) List Students");
        System.out.println("6) List Courses");
        System.out.println("7) Search For Students");
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

        (students.get(index)).setName("John");

    }
    public static void listStudents(){

        for (int i = 0; i < students.size();i++){

            System.out.print(i + ") " + students.get(i) + ", " );

        }

    }



}