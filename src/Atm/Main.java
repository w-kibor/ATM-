package Atm;

import java.util.Scanner;
public class Main extends AtmOperationImpl{
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int accountnumber=12345;
        int pin=123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM machine!!");
        System.out.println("Enter Account Number");
        int accountNumber=in.nextInt();
        System.out.println("Enter pin");
        int Pin=in.nextInt();
        if ((accountnumber==accountNumber)&&(pin==Pin)) {
            while(true){
                System.out.println("1.View available balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit from the Application");
                System.out.println("Enter choice: ");
                int ch=in.nextInt();
                if (ch==1) {
                    op.viewbalance();
                }
                else if (ch==2) {
                    System.out.println("Enter Amount to Withdraw");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("Enter Amount to deposit:");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);
                }

                else if(ch==5){
                    System.out.println("Collect your Atm card\nThankyou for usin ATM machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter valid choice");
                }
            }
        }
        else{
            System.out.println("Incorrect account Number or pin");
            System.exit(0);
        }
    }
}



