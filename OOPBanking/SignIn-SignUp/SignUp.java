import java.util.Scanner;

public class SignUp {
    public static float phoneNumber ;
    public static String customerPassword;
    public static String customerName;
    public static String customerSurname;

    public void signUp(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name: ");
         customerName = scanner.next();

        System.out.println("Write your surname: ");
         customerSurname = scanner.next();

        System.out.println("Write your phone number: ");
         phoneNumber = scanner.nextFloat();


        System.out.println("Create a password: ");
          customerPassword = scanner.next();


        System.out.println("Creating Account (Y/N)? ");
        String isCreated = scanner.next();

        if(isCreated.equals("Y")){
            SignIn signIn = new SignIn();
            signIn.signIn();
        }
        else{
            System.out.println("You didnt create your account do you want to rewrite again (Y/N)? ");
            String isRewrite = scanner.next();
            if(isRewrite.equals("Y")){
                SignUp signUp = new SignUp();
                signUp.signUp();
            }
            else{
                System.out.println("You logged out!");
            }
        }
    }

}
