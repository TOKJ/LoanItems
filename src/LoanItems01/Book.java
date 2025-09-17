package LoanItems01;

class Book extends LoanItem {

    public Book(String name,String type) {
        super(name, type);
    }


    public String toString() {
        return "    "+ name + "    " + type;
    }

}
