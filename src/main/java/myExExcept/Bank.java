package myExExcept;

public class Bank {
    int amount;

    public Bank(int amount){
        this.amount=amount;
        if(amount<0){
            throw new RuntimeException("Not enough bal to create an account");
        }
    }


public void withdraw(int amountWithdr) throws Exception {
        if(amountWithdr< amount){
            throw new Exception("Not enough money o withdraw");
        }

}}


