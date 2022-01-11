package BMW_Office.Infrastructure.PaymentMethods;

public class Card implements IPay{
    @Override
    public void payCar(int cash) {
        System.out.println("");
        System.out.println("Your was paid by card.");
        System.out.println("Total sum is " + cash);
    }
}
