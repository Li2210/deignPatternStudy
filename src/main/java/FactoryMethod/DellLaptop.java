package FactoryMethod;

public class DellLaptop implements Laptop {

    @Override
    public void create() {
        System.out.println("created by Dell");
    }

    @Override
    public void sell() {
        System.out.println("the price is 15000");
    }

}
