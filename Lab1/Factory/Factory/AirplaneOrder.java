package Lab1.Factory.Factory;

import Lab1.Factory.Transport.Airplane;
import Lab1.Factory.Transport.ITransport;

public class AirplaneOrder extends Delivery{

    public ITransport createOrder() {
        return new Airplane();
    }
}
