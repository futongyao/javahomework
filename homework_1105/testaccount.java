import java.util.Date;
public class testaccount {
    public static class Account {
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        private Date dateCreated=new java.util.Date();

        public Account() {
        }
        public Account(int newId, double newBalance) {
            id = newId;
            balance = newBalance;
        }
        public void setId(int newId) {
            id = newId;
        }
        public int getId() {
            return id;
        }
        public void setBalance(double newBalance) {
            balance = newBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void setAnnualInterestRate(double newAnnualInterestRate) {
            annualInterestRate = newAnnualInterestRate;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public double getMonthlyInterestRate() {
            double rate=annualInterestRate/100/12;
            return rate;
        }

        public double getMonthlyInterest() {
            double interest=balance * getMonthlyInterestRate();
            return interest;
        }

        public void withDraw(double newWithDraw) {
            balance=balance-newWithDraw;
        }

        public void deposit(double newDeposit) {
            balance=balance + newDeposit;
        }
    }
    public static void main(String[] args) {
        Account account1 =new Account(1122,20000);
        account1.setAnnualInterestRate(4.5);
        account1.withDraw(2500);
        account1.deposit(3000);
        System.out.println("账户余额为"+account1.getBalance());
        System.out.println("月利息为"+account1.getMonthlyInterest());
        System.out.println("开户日期为"+account1.getDateCreated());
    }

}
