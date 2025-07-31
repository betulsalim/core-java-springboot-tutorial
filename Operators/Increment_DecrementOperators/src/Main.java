//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**Increment Operators:
         * Pre Increment : Value is incremented first and then assigned or used in an expression.
         * Post Increment : Value is assigned or used in an expression first and then incremented.
         */
        int x = 100;
        int y = x++; //this is post increment
        int z = ++x; //this is pre increment
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);

        /**Decrement Operators:
         * Pre Decrement
         * Post Decrement
         */
        System.out.println();
        x = 100;
         y = x--; //this is post decrement
         z = --x; //this is pre decrement
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}