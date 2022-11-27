public class girokonto extends baseaccount {
    public int limit=500;

    public void ChangeLimit(int limit) {
        this.limit=limit;
    }

    @Override
    public double withdraw(double amount){
        if (amount>=limit) {
            System.out.println("Nicht möglich, höher als Limit");
            return 0;
        }

        else {
            return super.withdraw(amount);
        }
    }
}
