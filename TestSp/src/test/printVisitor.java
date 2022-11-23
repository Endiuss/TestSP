package test;

public class printVisitor implements Visitor{
    @Override
    public void visitAn(an an) {
        System.out.println(an.print());
    }

    @Override
    public void visitGrupa(grupa grupa) {

     System.out.println("   "+grupa.print());
    }

    @Override
    public void visitSubgrupa(subgrupa subgrupa) {
        System.out.println("     "+subgrupa.print());
    }

    @Override
    public void visitStudent(student student) {
        System.out.println("        "+student.print());
    }
}
