package BMW_Office.Infrastructure.DeliveryCar.Delivery;

import BMW_Office.Infrastructure.DeliveryCar.Transport.ITransport;

public abstract class Delivery {
    public void renderOrder(){
        ITransport transport = createOrder();
        transport.Deliver();
    }
    public abstract ITransport createOrder();
}
