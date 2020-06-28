package Inheritance;

public class App {

    public static void main(String[] args) {
        BenzGermanBigCar bgb = new BenzGermanBigCar();
        bgb.getCarName();
        bgb.getCarNation();
        bgb.getCarType();
        System.out.println("-------------------");
        FerrariItalySmallCar fis = new FerrariItalySmallCar();
        fis.getCarName();
        fis.getCarNation();
        fis.getCarType();
    }

}
