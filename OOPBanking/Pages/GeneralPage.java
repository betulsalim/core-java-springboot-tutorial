import java.util.Scanner;

public class GeneralPage {

    public void generalPage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which page you want to go? ");

        System.out.println("1 - Bank Information");
        System.out.println("2 - Credit Information");
        System.out.println("3 - Profile Page");
        System.out.println("4 - Log Out");
        String chooseNumber = scanner.next();

        switch (chooseNumber){
            case "1" :
                BankInformationsPage bankInformationsPage = new BankInformationsPage();
                bankInformationsPage.bankInformationPage();
                break;
            case "2":
                CreditInformationsPage creditInformationsPage = new CreditInformationsPage();
                creditInformationsPage.credit();
                break;
            case "3" :
                ProfilePage profilePage = new ProfilePage();
                profilePage.profilePage();
                break;
            case "4" :
                System.out.println("You logged out!");
                break;
            default:
                System.out.println("unknown choice");
        }

    }

}
