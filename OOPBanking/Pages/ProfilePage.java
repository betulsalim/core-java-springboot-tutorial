import java.util.Scanner;

public class ProfilePage {

    public void profilePage (){
        Scanner scanner = new Scanner(System.in);
        SignUp signUp = new SignUp();
        System.out.println("Name - Surname: " + signUp.customerName + " - " + signUp.customerSurname);
        System.out.println("Phone Number: " + signUp.phoneNumber);
        System.out.println("Password: " + signUp.customerPassword);

        System.out.println("Change Password (Y/N)? ");
        String isChange = scanner.next();

        if(isChange.equals("Y")){
            System.out.println("Write your new password: ");
            String newCustomerPassword = scanner.next();

            newCustomerPassword = signUp.customerPassword;
        }
        System.out.println("Get Back to General Page (Y/N)? ");
        String isGetBack = scanner.next();

        if(isGetBack.equals("Y")){
            GeneralPage generalPage = new GeneralPage();
            generalPage.generalPage();
        }
        else{
            System.out.println("You logged out!");
        }
    }

}
