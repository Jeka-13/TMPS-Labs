package BMW_Office;

import BMW_Office.Services.BmwOffice.BMW;

public class Main {
    public static void main(String[] args){
        BMW bmw = BMW.CreateBMWFactory("Moldova\n");
        bmw.ConnectToTheServer();
        bmw.ChoseModel("Sport car");
        bmw.ChoseMethodDelivery("Ship");
        bmw.ChoseNotification("Facebook");
        bmw.StartPaying();
    }
}
