import java.util.Scanner;

public class SignIn {

    public void signIn(){
        Scanner scanner = new Scanner(System.in);
        SignUp signUp = new SignUp();

        System.out.println("Write your phone number: ");
        float phoneNumber = scanner.nextFloat();



        if(phoneNumber == signUp.phoneNumber){
            System.out.println("Correct!");
        }

        System.out.println("Write your password: ");
        String customerPassword = scanner.next();

        if(customerPassword.equals(signUp.customerPassword)){
            System.out.println("Correct!");
        }

        if(phoneNumber == signUp.phoneNumber){
            if(customerPassword.equals(signUp.customerPassword)){
                System.out.println("Do you want to enter (Y/N)? ");
                String isEntered = scanner.next();

                if(isEntered.equals("Y")){
                    GeneralPage generalPage = new GeneralPage();
                    generalPage.generalPage();
                }
                else{
                    System.out.println("You didnt enter do you want to rewrite again (Y/N)? ");
                    String isRewrite = scanner.next();
                    if ((isRewrite.equals("Y"))){
                        SignIn signIn = new SignIn();
                        signIn.signIn();
                    }
                    else{
                        System.out.println("You logged out!");
                    }
                }
            }
        }

    }

}
