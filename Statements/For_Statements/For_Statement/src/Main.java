//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** we learned about while loops lets make the same thing with for staement too

         */
        int count = 20;

        for(int i = 0; i < count; i++){
            System.out.println("I love java " + i + " times");
        }
        for(int i = 0; i < count; i++)
            System.out.println("I love java for one statement without curly braces " + i + " times");
    }
}