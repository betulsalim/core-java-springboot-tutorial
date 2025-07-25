import java.util.Random;
import java.util.Scanner;

public class CreditInformationsPage {

    public void credit(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        float creditLimit, creditDebt, monthlyMinDebt;

        creditLimit = random.nextFloat(10000000);
        creditDebt = random.nextFloat(10000000);

        while (creditDebt > creditLimit){
            creditDebt = random.nextFloat(10000000);
        }

        if(creditLimit >= 15000){
            monthlyMinDebt = (creditDebt * 40) / 100;
        }
        else{
            monthlyMinDebt = (creditDebt * 20) / 100;
        }
        float lastCreditlimit = creditLimit - creditDebt;
        System.out.println("Credit Limit: " + lastCreditlimit);

        System.out.println("Your monthly dept is: " + creditDebt);
        System.out.println("Your min dept is: " + monthlyMinDebt);

        System.out.println("Do you want to Pay? (y/n) ");
        String isPaid = scanner.next();

        if(isPaid.equals("y")){
            BankInformationsPage bankInformationsPage = new BankInformationsPage();
            if(bankInformationsPage.newBankMoney > 0){
                System.out.println("Your money is: " + bankInformationsPage.newBankMoney);
                System.out.println("How much debt you want to pay? ");
                float payMoney = scanner.nextFloat();
                while(payMoney > bankInformationsPage.newBankMoney){
                    System.out.println("You made an error write again!");
                    System.out.println("Your money is: " + bankInformationsPage.newBankMoney);
                    System.out.println("How much debt you want to pay? ");
                    payMoney = scanner.nextFloat();
                }
                float newCreditDebt = creditDebt - payMoney;
                System.out.println("Your new credit debt is: " + newCreditDebt);
            }
            System.out.println("You paid your debt see you soon!");
            GeneralPage generalPage = new GeneralPage();
            generalPage.generalPage();
        }
        else{
            System.out.println("You didnt pay anything see you soon!");
            GeneralPage generalPage = new GeneralPage();
            generalPage.generalPage();
        }

    }

}
