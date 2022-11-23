package test;

public class Main {

    public static void main(String[] args) {
        Element info3 = new an("Informatica3").add(new grupa("Grupa 1")
                .add(new subgrupa("Semigrupa 1.1")
                        .add(new student("Popescu I", "popescu@acme.edu"))
                                .add(new student("Popescu I", "popescu@acme.edu"))


                        )
                );

        printVisitor tableVisitor = new printVisitor();
        info3.accept(tableVisitor);

    }
}