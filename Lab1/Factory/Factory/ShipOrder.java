package Lab1.Factory.Factory;

import Lab1.Factory.Transport.ITransport;
import Lab1.Factory.Transport.Ship;

public class ShipOrder extends Delivery{

    public ITransport createOrder() {
        return new Ship();
    }
}
