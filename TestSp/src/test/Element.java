package test;

public interface Element {
boolean print();
Element add( Element e);
    public void accept(Visitor visitor);
}
