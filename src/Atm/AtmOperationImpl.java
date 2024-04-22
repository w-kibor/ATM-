package Atm;

public class AtmOperationImpl implements AtmOperationInterf{

        ATM atm = new ATM();
        @Override
        public void viewbalance() {
            System.out.println("Available balance is:"+atm.getBalance());

        }

        @Override
        public void withdrawAmount(double withdrawAmount) {
            System.out.println(withdrawAmount+"Collect the cash");
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewbalance();

        }

        @Override
        public void depositAmount(double depositAmount) {
            System.out.println(depositAmount+ "deposited successfully!!");
            atm.setBalance(atm.getBalance()+depositAmount);
            viewbalance();

        }

        @Override
        public void viewMiniStatement() {

        }

    }


