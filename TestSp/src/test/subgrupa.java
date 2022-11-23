package test;

import java.util.ArrayList;
import java.util.List;

public class subgrupa implements Element {
    String nume;
    private List<Element> students = new ArrayList<>();
    public  subgrupa(String nume){
        this.nume=nume;
    }
    public Element add(Element s){students.add(s);
        return this;

    }
    @Override
    public boolean print(){
  String response="Subgrupa: "+nume;
  return response;
        }
    public void accept(Visitor visitor) {
        visitor.visitSubgrupa(this);
    }
}
