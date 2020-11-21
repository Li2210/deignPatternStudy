package DesignPattern.Decorator;

public class Stealth extends FighterDecorator {

    public Stealth(Fighter fighter){
        super(fighter);
    }

    public void protect(){
        System.out.println("use stealth to protect");
    }
}
