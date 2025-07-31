import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** Write a java software for banks which allow users above 21 years of age
         * to signup and create an account. If his age is above 55 years - create
         * a senior citizen account for him and if his age is between 21 to 55
         * create normal savings account for him
         *
         * ıf user below 21 years of age don't allow them to create an account
         *
         * if user is > 21 but < 55 print "savings account"
         * if user is > 55  print "senior citizen account"
         * if user < 21 print "ineligible"
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your age: ");
        int userAge = scanner.nextInt();

        if(userAge > 21){
            if(userAge > 55){
                System.out.println("senior citizen account");
            }
            else if(userAge > 21 && userAge < 55){
                System.out.println("savings account");
            }
        }else if (userAge < 21){
            System.out.println("ineligible");
        }
    }
}