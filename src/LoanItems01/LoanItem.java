package LoanItems01;

public class LoanItem {

    protected String name;
    protected String type;

    public LoanItem(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    //toString
    @Override
    public String toString() {
        return "Item: " + name + "Type: " + type + "";
    }

}
