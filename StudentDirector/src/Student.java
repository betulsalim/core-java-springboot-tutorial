import java.util.*;

public class Student {

    public static List<String> students = new ArrayList<>();
    public static List<String> studentsId = new ArrayList<>();
    public static Set<String> totalStudents = new TreeSet<>();
    public static int numberOfStudent;

    public void Student(){

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();



        System.out.println("How many student you have in your class currently?");
        numberOfStudent = scanner.nextInt();



            studentService.addStudentService();


        System.out.println("Do you want to delete a student? (y/n)");
        String isDelete = scanner.next();

        if(isDelete.equals("y")){
            studentService.deleteStudentService();
        }
        else{
            System.out.println("you didnt delete anyone");
        }

        System.out.println("This is your final list : ");
        studentService.arrangeWithId();

        System.out.println("If you want to filter for name : ");
        studentService.searchByName();

    }



}
