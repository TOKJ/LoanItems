package LoanItems01;

class Book extends LoanItem {

    public Book(String name,String type, int listNumber) {
        super(name, type, listNumber);
    }

    @Override
    public String toString() {
        return "Index:  " + listNumber + "   " + "\nType: " + type + "\nName: " + name +  "\n";
    }

}
