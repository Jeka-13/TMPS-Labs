package BMW_Office.Infrastructure.PaymentMethods;

public class PaymentSystem {
    private IPay pay;

    public PaymentSystem() {}

    public PaymentSystem(IPay pay){
        this.pay = pay;
    }

    public void setPayment(IPay pay){
        this.pay = pay;
        this.pay.payCar(150);
    }

}
