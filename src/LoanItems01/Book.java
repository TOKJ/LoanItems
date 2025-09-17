package LoanItems01;

class Book extends LoanItem {

    public Book(String name,String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "   " + "\nType: " + type + "\nName: " + name +  "\n";
    }

}
