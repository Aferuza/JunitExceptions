package ex;

public class BankAccount {
    private String owner;
    private int amount;


    // unchecked Exception
    public BankAccount(String bOwner, int bAmount){
//        if(amount <= 0){
//            throw new RuntimeException("Cannot create account with negatt balance");
//        }
//        this.owner = bOwner;
//        this.amount = bAmount;

    }
    // checked Exception
public void withdraw(int amountToWithdr) throws InsufFundExcep {
        if(amount - amountToWithdr <0){
    throw new InsufFundExcep("Not enogh money");
    }
    this.amount -= amountToWithdr;

    }
}

