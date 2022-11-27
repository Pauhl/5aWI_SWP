import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

       sparbuch sparbuch1=new sparbuch();
       GregorianCalendar now = new GregorianCalendar();
       System.out.println(sparbuch1.datum.format(now.getTime()));
       sparbuch1.deposit(1000);
       sparbuch1.withdraw(1100);
       System.out.println(sparbuch1.getBalance());

       girokonto girokonto1= new girokonto();
       girokonto1.withdraw(1);
       System.out.println(girokonto1.getBalance());

       ländlegirokonto ländlegirokonto1= new ländlegirokonto();
       ländlegirokonto1.deposit(12000);
       ländlegirokonto1.ChangeLimit(10000000);
       ländlegirokonto1.withdraw(11500);
       ländlegirokonto1.deposit(8500);
       System.out.println(ländlegirokonto1.getBalance());


       kreditkonto kreditkonto1 = new kreditkonto(10000, 50, 0.03);
       kreditkonto1.info();

    }
}