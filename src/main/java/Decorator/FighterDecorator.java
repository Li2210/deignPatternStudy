package Decorator;

public class FighterDecorator implements Fighter {

    protected Fighter fighter;

    public FighterDecorator(Fighter fighter){
        this.fighter = fighter;
    }

    @Override
    public void speed() {
        fighter.speed();
    }

    @Override
    public void attack() {
        fighter.attack();
    }
}
