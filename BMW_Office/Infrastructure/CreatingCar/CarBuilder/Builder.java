package BMW_Office.Infrastructure.CreatingCar.CarBuilder;

import BMW_Office.Infrastructure.CreatingCar.CarConfiguration.CarType;
import BMW_Office.Infrastructure.CreatingCar.Components.Engine;
import BMW_Office.Infrastructure.CreatingCar.Components.GPSNavigator;
import BMW_Office.Infrastructure.CreatingCar.Components.Transmission;
import BMW_Office.Infrastructure.CreatingCar.Components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
