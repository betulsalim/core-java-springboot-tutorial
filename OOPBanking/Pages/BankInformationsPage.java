import java.util.Random;
import java.util.Scanner;

public class BankInformationsPage {
    public static float bankMoney;
    public static float monthlyBills;
    public static float newBankMoney;

    public void bankInformationPage(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        bankMoney = random.nextFloat(50000);
        System.out.println("Your Money is: " + bankMoney);

        monthlyBills = random.nextFloat(50000);

        while(monthlyBills > bankMoney){
            monthlyBills = random.nextFloat(50000);
        }
        System.out.println("Your bills are: " + monthlyBills);

         newBankMoney = bankMoney - monthlyBills;
        System.out.println("Your Money after bills are: " + newBankMoney);

        System.out.println("Do you want to add money(y/n)? ");
        String isAdded = scanner.next();

        if(isAdded.equals("y")){
            System.out.println("How much money you want to add? ");
            float addMoney = scanner.nextFloat();
            float newMoney = newBankMoney + addMoney;
            System.out.println("Your new money is: " + newMoney);
            System.out.println("See you soon!");

        }
        else{
            System.out.println("You didnt add any money see you soon!!!");
        }
        GeneralPage generalPage = new GeneralPage();
        generalPage.generalPage();

    }

}
