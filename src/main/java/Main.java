import ex.BankAccount;

public class Main {

   public static void main(String[] args) {

       //unchecked
       BankAccount account1 = new BankAccount("Ally", 120);
       BankAccount account2 = new BankAccount("Cally", -2);

       //checked
       try {
           account1.withdraw(150);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
