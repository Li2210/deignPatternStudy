package designPattern.Visitor;

public class Lake implements Visitable{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
