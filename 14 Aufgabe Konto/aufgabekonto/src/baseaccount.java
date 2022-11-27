
import java.text.DateFormat;
import static java.text.DateFormat.getDateInstance;

public class baseaccount {
    double balance;
    private String owner;
    public DateFormat datum = DateFormat.getDateInstance(DateFormat.MEDIUM);

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }
}
