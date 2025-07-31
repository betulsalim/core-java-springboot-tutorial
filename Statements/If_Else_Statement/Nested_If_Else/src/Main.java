//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 20;

        //Landered if
        if(age > 13){
            System.out.println("Welcome to my website");
        } else if (age == 13){
            System.out.println("Please provide your email id");
        }else{
            System.out.println("You must be above 13");
        }
        System.out.println("Please leave some feedback");

        int userAge = 20;
        //Nested if
        if(userAge > 13){
            System.out.println("Welcome to my website");
            if(userAge < 25 && userAge >= 20){
                System.out.println("Congrats you have won discount");
            }
        } else if (userAge == 13){
            System.out.println("Please provide your email id");
        }else{
            System.out.println("You must be above 13");
        }
        System.out.println("Please leave some feedback");
    }
}