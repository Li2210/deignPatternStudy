package bridge;

public class Ferrari extends Brand {

    @Override
    public void getCarBrand(){
        System.out.println("This is a Ferrari car");
        super.nation.getCarNation();
    }
}
