import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class StudentService {

    Scanner scanner = new Scanner(System.in);
    public static Student student = new Student();

    public void addStudentService(){
        Student student = new Student();


        for(int studentCount = 1; studentCount <= student.numberOfStudent; studentCount++){
            System.out.println((studentCount) +" . student name: ");
            String studentName = scanner.next();
            student.students.add(studentName);

            for(int idCount = 1; idCount <= student.numberOfStudent; idCount++){
                String studentId = UUID.randomUUID().toString();
                student.studentsId.add(studentId);

                if(studentCount == idCount){
                    student.totalStudents.add(studentId + " - " +studentName);
                }
            }

        }


        System.out.println("Students with ids: " + student.totalStudents);

    }

    public void deleteStudentService(){
        System.out.println("Which student do you want to delete? Write the name:");
        student.totalStudents.forEach(System.out::println);

        String deleteName = scanner.next();
        boolean found = false;

        for (int i = 0; i < student.students.size(); i++) {
            if (student.students.get(i).equalsIgnoreCase(deleteName)) {
                String id = student.studentsId.get(i).toString();

                String target = student.studentsId.get(i) + " - " + student.students.get(i);
                student.totalStudents.remove(target); // objeye göre silme
                student.students.remove(i);
                student.studentsId.remove(i);

                System.out.println("Student '" + deleteName + "' with ID '" + id + "' removed.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with that name.");
        }
    }

    public void arrangeWithId(){

        //I used TreeSet here
        System.out.println("Students: " + student.totalStudents);

    }

    public void searchByName(){


        System.out.println("Which name you want to search? ");
        String name = scanner.next();

        for(String studentInfo : student.totalStudents){
            if(studentInfo.endsWith(" - " + name)){
                System.out.println("Found student: " + name);

            }
            else{
                System.out.println("There is no student in that name");
            }
        }

    }


}
