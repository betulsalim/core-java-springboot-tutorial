import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** write a java program to accept the grade of the student from the
         * console and congratulate him.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student grade:(1 to 4) ");
        int studentGrade = scanner.nextInt();

        switch (studentGrade){
            case  1:
                System.out.println("You failed");
                break;
            case 2 :
                System.out.println("If you study more you can pass maybe");
                break;
            case 3 :
                System.out.println("You passed");
                break;
            case 4 :
                System.out.println("Congrats you passed with high note");
                break;
            default:
                System.out.println("Error of the grade");
                break;
        }

    }
}