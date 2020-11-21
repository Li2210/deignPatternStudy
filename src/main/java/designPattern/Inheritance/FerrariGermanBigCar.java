package designPattern.Inheritance;

public class FerrariGermanBigCar implements Car {

    @Override
    public void getCarName(){
        System.out.println("This is Ferrari");
    }

    @Override
    public void getCarNation(){
        System.out.println("This is from German");
    }

    @Override
    public void getCarType() {
        System.out.println("This is a big car");
    }
}
