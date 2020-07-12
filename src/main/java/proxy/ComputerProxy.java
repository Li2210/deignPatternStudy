package proxy;

public class ComputerProxy implements subject {

    protected subject mysubject;

    public ComputerProxy(subject realSubject){
        this.mysubject = realSubject;
    }

    @Override
    public void play() {
        mysubject.play();
    }
}
