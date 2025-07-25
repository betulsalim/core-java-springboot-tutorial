import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1,num2;
        String processName;

        System.out.println("Write your first number: ");
        num1 = scanner.nextFloat();

        System.out.println("Write your second number: ");
        num2 = scanner.nextFloat();

        System.out.println("Write your process name if add write add");
        processName = scanner.next();

        switch (processName) {
            case "add" -> {
                AdditionProcess additionProcess = new AdditionProcess();
                additionProcess.Add(num1, num2);
            }
            case "division" -> {
                Division division = new Division();
                division.Division(num1, num2);
            }
            case "multiplication" -> {
                Multiplication multiplication = new Multiplication();
                multiplication.Multiplication(num1, num2);
            }
            case "substraction" -> {
                Substraction substraction = new Substraction();
                substraction.Substraction(num1, num2);
            }
        }
    }
}