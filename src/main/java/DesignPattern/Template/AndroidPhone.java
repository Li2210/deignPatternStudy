package DesignPattern.Template;

public class AndroidPhone extends Phone{

    @Override
    public void os(){
        System.out.println("provide bad operating system android");
    }

    @Override
    public void screen(){
        System.out.println("provide high resolution screen");
    }

}
