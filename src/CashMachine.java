public class CashMachine {
    public static void main(String[] args) {

        Person person = new Person("Kasia");



       try{ BankAccount bankAccount = new BankAccount(person,30000);
           bankAccount.deposit(10000);
           System.out.println(bankAccount.getBalance());
           bankAccount.withdraw(20000);
           System.out.println(bankAccount.getBalance());
       }
       catch (NullPointerException ex) {
           System.out.println("Przypisz osobę");
       }
       catch (NotEnoughBalanceException ex) {
           System.out.println("Nie masz wystarczających środków");
        }
        catch (WithdrawAboveTheLimit ex) {
            System.out.println("Wypłata ponad limit");
        }

}}
