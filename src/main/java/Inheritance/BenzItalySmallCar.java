package Inheritance;

public class BenzItalySmallCar implements Car {

    @Override
    public void getCarName(){
        System.out.println("This is Benz");
    }

    @Override
    public void getCarNation(){
        System.out.println("This is from Italy");
    }

    @Override
    public void getCarType(){
        System.out.println("This is a small car");
    }

}
