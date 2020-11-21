package DesignPattern.state;

public interface State {

    void doAction(Context context);

    void observe();
}
