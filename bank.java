
import java.util.ArrayList;

class Transaction{
    String type;
    double amount;
    Transaction(String type, double amount){
        this.type=type;
        this.amount=amount;

    }
    public String toString(){
        return type + ":Rs. " + amount;
    }
}

class Account{
    private String name;
    private int accountnumber;
    private double balance;

    public Account(String name, int accountnumber, double balance){
        this.accountnumber=accountnumber;
        this.name=name;
        this.balance=balance;
    }
    ArrayList<Transaction> transaction =new ArrayList<>();
    public  void deposit(int amount){
        if(amount>0){
            balance= balance+amount;
            transaction.add( new Transaction("deposit", amount));
            System.out.println("Deposited succesfully");
        }

    }
    public void withdraw(double amount){
        if(amount>0){
            balance -= amount;
            transaction.add( new Transaction("deposit", amount));
            System.out.println("Deposited succesfully");
        }
    }
}

public class bank {
    
}
