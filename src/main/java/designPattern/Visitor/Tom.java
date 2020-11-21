package designPattern.Visitor;

public class Tom implements Visitor {

    @Override
    public void visit(Lake lake) {
        System.out.println("Tom is visiting lake");
    }

    @Override
    public void visit(Mountain mountain) {
        System.out.println("Tom is visiting mountain");
    }

}
