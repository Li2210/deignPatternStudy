package DesignPattern.Builder;

public class OPPO extends Builder {

    private Smartphone smartphone;

    public OPPO(int cpu, String screen){
        smartphone = new Smartphone(cpu, screen);
    }

    @Override
    public void setCamera(){
        smartphone.setCamera("imx200");
    }

    @Override
    public void setOS(){
        smartphone.setOS("ColorOS");
    }

    @Override
    public void setSpeaker(){
        smartphone.setSpeaker(1);
    }

    @Override
    public Smartphone getSmartphone(){
        return smartphone;
    }

}
