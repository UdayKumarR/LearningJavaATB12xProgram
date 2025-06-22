package exam_12Xb_22062025_OOPsJava;

class exam4_bankAccountEncap
    {
        public static void main(String[] args) throws Exception {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(200);
    }

    public static class BankAccount {
        private double intialBalance = 1000;
        private double balance = 0;
        private double depositAmount = 0;
        private static double minBal = 1000;
        private double withdrawAmount = 0;

        public void deposit(double depositAmount) throws Exception {
            if (depositAmount < 0)
                throw new Exception("Deposit Amount Cannot be Negative");
            else {
                if (balance == 0) {
                    balance = intialBalance + depositAmount;
                } else {
                    balance = balance + depositAmount;
                }
                System.out.println("Deposit of " + depositAmount + " Successful");
                System.out.println("Balance after deposit: " + getBalance());
            }
        }

        public void withdraw(double withdrawAmount) throws Exception {
            if (withdrawAmount < 0) {
                throw new Exception("Withdraw Amount cannot be Negative");
            }
            if (balance == 0) {
                balance = intialBalance - withdrawAmount;
            } else {
                balance = balance - withdrawAmount;
            }
            if (balance < minBal)
                throw new Exception("Balance after withdrawal cannot be less than minimum Balance");
            else {
                System.out.println("Withdrawal of " + withdrawAmount + " completed");
                System.out.println("Balance after withdrawal: " + getBalance());
            }
        }

        public double getBalance() {
            return balance;
        }
    }
}
