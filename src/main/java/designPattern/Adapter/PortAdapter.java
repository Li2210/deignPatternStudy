package designPattern.Adapter;

/**
 * adapter 适配者，用于实现目标接口，并拥有被适配者的引用
 */
public class PortAdapter implements TypeC {
    private Iphone iphone;

    public PortAdapter(Iphone iphone){
        this.iphone = iphone;
    }

    public void typeCPort(){
        iphone.port();
    }
}
