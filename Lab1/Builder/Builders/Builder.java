package Lab1.Builder.Builders;

import Lab1.Builder.Cars.CarType;
import Lab1.Builder.Components.Engine;
import Lab1.Builder.Components.GPSNavigator;
import Lab1.Builder.Components.Transmission;
import Lab1.Builder.Components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
