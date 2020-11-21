package designPattern.Template;

public class Iphone extends Phone {

    @Override
    public void os(){
        System.out.println("provide good operating system ios");
    }

    @Override
    public void screen(){
        System.out.println("provide low resolution screen");
    }

}
