public class sparbuch extends baseaccount {
    @Override
    public double withdraw(double amount) {
        if (this.getBalance()-amount<0) {
            System.out.println("Kontostand zu niedrig");
            return 0;
        }
        else {
            return super.withdraw(amount);

        }
    }
}
