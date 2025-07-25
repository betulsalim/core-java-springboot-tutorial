//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declare the variable
        //it actually assigns a place and call it firstVariable
        int firstVariable;

        //Initialize the variable
        //in that line 10 is actually sored in the
        // memory block named firstVariable we created
        firstVariable = 10;

        int secondVariable = 20;
        int total = firstVariable + secondVariable;

        System.out.println("First Variable: " + firstVariable);

        //now the firstVariable became 5 while the total is still 30
        firstVariable = 5;

        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);
        System.out.println("Total: " + total);
    }
}