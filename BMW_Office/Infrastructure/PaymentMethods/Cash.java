package BMW_Office.Infrastructure.PaymentMethods;

public class Cash implements IPay{
    @Override
    public void payCar(int cash) {
        System.out.println("");
        System.out.println("Your was paid by cash.");
        System.out.println("Total sum is " + cash);
    }
}
