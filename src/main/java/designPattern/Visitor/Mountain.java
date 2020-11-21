package designPattern.Visitor;

public class Mountain implements Visitable{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
