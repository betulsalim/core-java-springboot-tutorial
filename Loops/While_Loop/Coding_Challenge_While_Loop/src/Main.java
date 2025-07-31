import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** Write a java program to accept integer from user and print the
         * factorial of number using while loop.
         */

        Scanner scanner =  new Scanner(System.in);
        int i = 0,result= 1;

        System.out.println("Write your favourite number: ");
        int number = scanner.nextInt();

        while(i < number){
            i++;
            result *= i;

        }
        System.out.println(number + " - factorial is: " + result);
    }
}