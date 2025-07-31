//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         == TYPES OF JAVA OPERATORS ==

         Arithmetic Operators :
            + - / * % ++ --

         Relational Operators
            == != < > <= >=

         Logical Operators
             && || !

         Assignment Operators
             = += -= /= %=

         Conditional Operators
            ?:
         */
        //we can both declare the variables in single statement or separated
        int a = 10, b = 20 , c = 15, d = 25;
        int variable = 9;
        int variable1 = 30;

        System.out.println( a + " + " + b +" = " + (a+b));
        System.out.println( a + " - " + b +" = " + (a-b));
        System.out.println( a + " * " + b +" = " + (a*b));
        System.out.println( a + " / " + b +" = " + (a/b));
        System.out.println( a + " % " + b +" = " + (a%b));
        System.out.println("a: " + a);
        a = a + 1;
        System.out.println("a + 1 = " + a);
        a++;
        System.out.println("new a is a++ : " + a);
        a--;
        System.out.println("new a is a-- : " + a);

    }
}