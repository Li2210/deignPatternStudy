package DesignPattern.Builder;

public class XiaoMi extends Builder {

    private Smartphone smartphone;

    public XiaoMi(int cpu, String screen){
        smartphone = new Smartphone(cpu, screen);
    }

    @Override
    public void setCamera(){
        smartphone.setCamera("imx100");
    }

    @Override
    public void setOS(){
        smartphone.setOS("MiUI");
    }

    @Override
    public void setSpeaker(){
        smartphone.setSpeaker(2);
    }

    @Override
    public Smartphone getSmartphone(){
        return smartphone;
    }

}
