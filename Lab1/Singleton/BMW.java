package Lab1.Singleton;

import Lab1.Builder.Builders.CarBuilder;
import Lab1.Builder.Builders.CarManualBuilder;
import Lab1.Builder.Cars.Car;
import Lab1.Builder.Cars.Manual;
import Lab1.Builder.Director.Director;
import Lab1.Factory.Factory.AirplaneOrder;
import Lab1.Factory.Factory.Delivery;
import Lab1.Factory.Factory.ShipOrder;

public final class BMW {
    private static BMW instance;
    public String country;


    private BMW(String country) {
        this.country = country;
    }


    public static BMW CreateBMWFactory(String country){
        if(instance==null){
            instance = new BMW(country);
            System.out.println("Has created a new BMW office in " + instance.country);
        }
        return instance;
    }

    public void ChoseModel(String category){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        switch (category){
            case "Sport car": {
                director.constructSportsCar(builder);
                Car car = builder.getResult();
                System.out.println("Car built:\n" + car.getCarType());

                director.constructSportsCar(manualBuilder);
                Manual carManual = manualBuilder.getResult();
                System.out.println("\nCar manual built:\n" + carManual.print());
                break;
            }
            case "City car": {
                director.constructCityCar(builder);
                Car car = builder.getResult();
                System.out.println("Car built:\n" + car.getCarType());

                director.constructCityCar(manualBuilder);
                Manual carManual = manualBuilder.getResult();
                System.out.println("\nCar manual built:\n" + carManual.print());
                break;
            }
            case "SUV": {
                director.constructSUV(builder);
                Car car = builder.getResult();
                System.out.println("Car built:\n" + car.getCarType());

                director.constructSUV(manualBuilder);
                Manual carManual = manualBuilder.getResult();
                System.out.println("\nCar manual built:\n" + carManual.print());
                break;
            }
            default: {
                System.out.println("There is no such category");
                break;
            }
        }
    }
    public void ChoseMethodDelivery(String method){
        Delivery delivery;
        switch (method){
            case "Ship": {
                delivery = new ShipOrder();
                delivery.renderOrder();
                break;
            }
            case "Airplane": {
                delivery = new AirplaneOrder();
                delivery.renderOrder();
                break;
            }
            default: {
                System.out.println("There is no such method to deliver your car");
            }
        }
    }
}
