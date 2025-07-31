import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** Write a do-while loop that asks the user to enter two numbers
         * the numbers hsould be added and sum displayed. after adding
         * and printing the loop should ask the user whether he or she
         * wished to perform operation again If so the loop should
         * repeat otherwise it should terminate
         */
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Write your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Write your second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("your sum is: " + sum);

        System.out.println("Do you want to repeat? y/n");
        String isRepeated = scanner.next();

        do{
            System.out.println("Write your first number: ");
             firstNumber = scanner.nextInt();

            System.out.println("Write your second number: ");
             secondNumber = scanner.nextInt();

             sum = firstNumber + secondNumber;
            System.out.println("your sum is: " + sum);
            System.out.println("Do you want to repeat? y/n");
             isRepeated = scanner.next();
        } while(isRepeated.equals("y"));

        if(isRepeated.equals("n")){
            System.out.println("you got out the system");
        }

    }




}