package LoanItems01;


public class LoanItem {
    // Protected da vi kun skal bruge dem indenfor denne subclass
    protected String name;
    protected String type;

    // Her har vi vores konstruktør til at lave bøger og videoer.
    public LoanItem(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Vores getters - her til name
    public String getName() {
        return name;
    }
    // Vores getters - her til type
    public String getType() {
        return type;
    }
    // Dette er for at indkapsle vores data


    //toString -> her formaterer vi vores data
    @Override
    public String toString() {
        return "\t▸ "+ type + "\t\t▸ " + name ;
    }

}
