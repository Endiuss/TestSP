package test;

import java.util.ArrayList;
import java.util.List;

public class an implements Element {
    String nume;
    private List<Element> grupe = new ArrayList<>();
    public  an(String nume){this.nume=nume;}
    public Element add(Element g){this.grupe.add(g);
    return this;}
    public boolean print(){System.out.println("An: "+nume);
        
    }
    public void accept(Visitor visitor) {
        visitor.visitAn(this);
    }
}
