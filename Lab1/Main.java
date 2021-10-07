package Lab1;

import Lab1.Singleton.BMW;

public class Main {
    public static void main(String[] args){
        BMW bmw = BMW.CreateBMWFactory("Moldova\n");
        bmw.ChoseModel("Sport car");
        bmw.ChoseMethodDelivery("Ship");
    }
}
