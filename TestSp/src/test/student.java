package test;

public class student implements Element {
    private String nume;
    private String email;
    public student(String nume,String email){
        this.nume=nume;
        this.email=email;

    };
    @Override
    public boolean print(){

        String response =nume+","+email;
        return response;
        }
        @Override
 public Element add(Element e){return null;}
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}

