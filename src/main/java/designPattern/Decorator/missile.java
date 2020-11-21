package designPattern.Decorator;

public class missile extends FighterDecorator {

    public missile(Fighter fighter){
        super(fighter);
    }

    @Override
    public void attack(){
        System.out.println("launch missile to attack");
    }

}
