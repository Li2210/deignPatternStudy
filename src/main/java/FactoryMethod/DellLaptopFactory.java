package FactoryMethod;

public class DellLaptopFactory implements LaptopFactory{

    @Override
    public Laptop createLaptop() {
        return new DellLaptop();
    }

}
