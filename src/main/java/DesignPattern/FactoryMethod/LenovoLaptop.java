package DesignPattern.FactoryMethod;

public class LenovoLaptop implements Laptop {

    @Override
    public void create() {
        System.out.println("square");
    }

    @Override
    public void sell() {
        System.out.println("the price is 10000");
    }

}
