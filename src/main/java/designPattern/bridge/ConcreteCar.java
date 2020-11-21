package designPattern.bridge;

public class ConcreteCar{

    public static void main(String[] args) {
        Size size = new BigSize();

        Nation nation = new German();
        nation.size = size;

        Brand brand = new Benz();
        brand.nation = nation;

        brand.getCarBrand();

    }

}
