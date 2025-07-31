import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**if (condition) if the cons,d,ton is true the code will enter the "coding..."
         * {
         * coding...
         * }
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your age: ");
        int ageUser = scanner.nextInt();

        if(ageUser < 13){
            System.out.println("Your age: " + ageUser + " is litte from 13 so you cant enter!");
        }
        else if (13 <= ageUser && ageUser < 16 ){
            System.out.println("Your age: " + ageUser + " you need to show your permission");
        }
        else {
            System.out.println("You age: " + ageUser +" you can enter");
        }
    }
}