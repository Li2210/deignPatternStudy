package DesignPattern.FactoryMethod;

public class AppleLaptop implements Laptop {

    @Override
    public void create() {
        System.out.println("created by Apple");
    }

    @Override
    public void sell() {
        System.out.println("the price is 20000");
    }

}
