package test;

import java.util.ArrayList;
import java.util.List;

public class grupa implements Element {

    String nume;
    private List<Element> subgrupe = new ArrayList<>();
    public grupa(String nume){
        this.nume=nume;
    }
    public Element add(Element s){this.subgrupe.add(s);
    return this;}
    @Override
    public boolean print(){String response ="Grupa: "+nume;
       return response;
        }
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }

}
