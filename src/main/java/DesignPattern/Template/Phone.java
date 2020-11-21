package DesignPattern.Template;

public abstract class Phone {

    abstract void screen();

    abstract void os();

    void camera(){
        System.out.println("good camera");
    }

    void voice(){
        System.out.println("provide dual speakers");
    }

    final void createPhone(){

        this.os();

        this.screen();

        this.camera();

        this.voice();

    }
}
