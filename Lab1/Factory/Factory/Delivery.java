package Lab1.Factory.Factory;

import Lab1.Factory.Transport.ITransport;

public abstract class Delivery {
    public void renderOrder(){
        ITransport transport = createOrder();
        transport.Deliver();
    }
    public abstract ITransport createOrder();
}
