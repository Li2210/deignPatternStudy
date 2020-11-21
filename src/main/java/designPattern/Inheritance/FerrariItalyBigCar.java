package designPattern.Inheritance;

public class FerrariItalyBigCar implements Car {

    @Override
    public void getCarName(){
        System.out.println("This is Ferrari");
    }

    @Override
    public void getCarNation(){
        System.out.println("This is from Italy");
    }

    @Override
    public void getCarType() {
        System.out.println("This is a big car");
    }
}
