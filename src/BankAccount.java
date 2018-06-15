public class BankAccount {
   private Person person;
    private double balance;
    private static int LIMIT = 10000;


    public BankAccount(Person person, double balance) {

        if (person == null) {
            throw new NullPointerException();
        }
        this.person = person;
        this.balance = balance;
    }

    public double deposit(double additionalMoney){
        balance = balance + additionalMoney;
        return balance;
    }

    public double withdraw(double money){
        if (money > balance)
            throw new NotEnoughBalanceException();
        else if (money > LIMIT)
            throw new WithdrawAboveTheLimit();
        else
            balance = balance - money;
        return balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
