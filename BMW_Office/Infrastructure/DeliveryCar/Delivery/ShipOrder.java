package BMW_Office.Infrastructure.DeliveryCar.Delivery;

import BMW_Office.Infrastructure.DeliveryCar.Transport.ITransport;
import BMW_Office.Infrastructure.DeliveryCar.Transport.Ship;

public class ShipOrder extends Delivery{

    public ITransport createOrder() {
        return new Ship();
    }
}
