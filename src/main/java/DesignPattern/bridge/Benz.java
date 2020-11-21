package DesignPattern.bridge;

public class Benz extends Brand{

    @Override
    public void getCarBrand(){
        System.out.println("this is a Benz car");
        super.nation.getCarNation();
    }
}
