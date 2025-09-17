package LoanItems01;

class Video extends LoanItem {

    public Video(String name,String type, int listNumber) {
        super(name, type, listNumber);
    }


    @Override
    public String toString() {
        return "Index:  " + listNumber + "\nName: " + name + "\nType: " + type + "\n ";
    }

}
