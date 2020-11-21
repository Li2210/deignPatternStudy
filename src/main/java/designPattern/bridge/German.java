package designPattern.bridge;

public class German extends Nation {

    @Override
    public void getCarNation(){
        System.out.println("German");
        super.size.getCarSize();
    }
}
