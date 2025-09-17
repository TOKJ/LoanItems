package LoanItems01;

import java.util.stream.IntStream;

public class LoanItem {

    protected String name;
    protected String type;
    protected int listNumber;

    public LoanItem(String name, String type, int listNumber) {
        this.name = name;
        this.type = type;
        this.listNumber = listNumber++;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getListNumber() {
        return listNumber;
    }


    //toString
    @Override
    public String toString() {
        return "Index: " + listNumber + "Name: " + name + "Type: " + type + "";
    }

}
