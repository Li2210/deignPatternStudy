package FactoryMethod;

public class AppleLaptopFactory implements LaptopFactory {

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }

}
