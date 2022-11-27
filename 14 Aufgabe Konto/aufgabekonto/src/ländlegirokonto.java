import java.text.DateFormat;

public class ländlegirokonto extends girokonto{

    private int spendmoney;
    public double bonus;


    public double withdraw(double amount){
        if (amount>=super.limit) {
            System.out.println("Nicht möglich, höher als Limit");
            return 0;
        }

        else {
            spendmoney+=amount;
            if(spendmoney>10000) {
                bonus=0.01;
            }
            if(spendmoney>100000) {
                bonus=0.02;
            }
            return super.withdraw(amount);
        }
    }

    @Override
    public void deposit(double amount){
        this.balance += amount*(1+bonus);
    }
}
