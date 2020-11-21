package DesignPattern.FactoryMethod;

public class App {

    public static void main(String[] args) {

        LaptopFactory laptopFactory = new AppleLaptopFactory();
        Laptop appleLaptop = laptopFactory.createLaptop();
        appleLaptop.create();
        appleLaptop.sell();

    }

}
