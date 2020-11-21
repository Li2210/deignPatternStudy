package DesignPattern.Visitor;

public class Jerry implements Visitor {

    @Override
    public void visit(Lake lake) {
        System.out.println("Jerry is visiting lake");
    }

    @Override
    public void visit(Mountain mountain) {
        System.out.println("Jerry is visiting mountain");
    }

}
