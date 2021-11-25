package BMW_Office.Infrastructure.DeliveryCar.Delivery;

import BMW_Office.Infrastructure.DeliveryCar.Transport.Airplane;
import BMW_Office.Infrastructure.DeliveryCar.Transport.ITransport;

public class AirplaneOrder extends Delivery{

    public ITransport createOrder() {
        return new Airplane();
    }
}
