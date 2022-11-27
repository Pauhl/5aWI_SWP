public class kreditkonto extends baseaccount{
    double MonthRepayment;
    int term;
    double charge;

    public kreditkonto(double balance, int term, double charge) {

        this.balance=balance;
        this.MonthRepayment=(balance/term)*(1+charge);
    }

    public void info() {
        System.out.println("Balance:"+balance);
        System.out.println("Montly payment:"+MonthRepayment);
    }

}
