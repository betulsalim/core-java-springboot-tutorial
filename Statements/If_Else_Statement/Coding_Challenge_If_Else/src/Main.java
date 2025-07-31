import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** Write a java software for banks which allow users above 21
         * years of age to signup and create an account If the user
         * is below 21 years of age don't allow them to create an account
         *
         * if user is above 21 years of age -> print "eligible"
         * if user is below 21 years of age -> print "ineligible"
         *
         */
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Write your age: ");
        int userAge = scanner.nextInt();

        if(userAge < 21){
            System.out.println("ineligible");
        }
        else if(userAge > 21){
            System.out.println("eligible");
        }
    }
}