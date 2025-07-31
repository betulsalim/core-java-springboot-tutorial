import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** write a java program to accept integer from user and
         * print its first 10 multiples using for loop
         */

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Write your number: ");
        int number = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " * " + number +  " : " + (i*number));
        }
    }
}