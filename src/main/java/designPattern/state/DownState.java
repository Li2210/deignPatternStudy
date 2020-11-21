package designPattern.state;

public class DownState implements State {

    @Override
    public void doAction(Context context){
        System.out.println("This is down state");
        context.setState(this);
    }

    @Override
    public void observe(){
        System.out.println("elevator is down now");
    }

}
