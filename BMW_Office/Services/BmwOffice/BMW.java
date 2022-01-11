package BMW_Office.Services.BmwOffice;

import BMW_Office.Infrastructure.CreatingCar.CarBuilder.CarBuilder;
import BMW_Office.Infrastructure.CreatingCar.CarBuilder.CarManualBuilder;
import BMW_Office.Domain.Entity.Car;
import BMW_Office.Infrastructure.CreatingCar.CarConfiguration.Manual;
import BMW_Office.Infrastructure.CreatingCar.Director.Director;
import BMW_Office.Infrastructure.DeliveryCar.Delivery.AirplaneOrder;
import BMW_Office.Infrastructure.DeliveryCar.Delivery.Delivery;
import BMW_Office.Infrastructure.DeliveryCar.Delivery.ShipOrder;
import BMW_Office.Infrastructure.Notification.*;
import BMW_Office.Infrastructure.PaymentMethods.Card;
import BMW_Office.Infrastructure.PaymentMethods.PaymentSystem;
import BMW_Office.Infrastructure.Server.Proxy;
import BMW_Office.Infrastructure.Server.Server;

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
    public void ChoseNotification(String notificationMethod){
        INotify iNotify;
        switch (notificationMethod) {
            case "Facebook" : {
                iNotify = new NotificationByFacebook();
                iNotify.Notify();
                break;
            }
            case "Instagram" : {
                iNotify = new NotificationByInstagram();
                iNotify.Notify();
                break;
            }
            case "Mail" : {
                iNotify = new NotificationByMail();
                iNotify.notify();
                break;
            }
        }
    }
    public void ConnectToTheServer() {
        Server server = new Server();
        Proxy proxy = new Proxy(server);
        proxy.Request();
    }

    public void StartPaying() {
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.setPayment(new Card());
    }
}
