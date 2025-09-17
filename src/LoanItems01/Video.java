package LoanItems01;

class Video extends LoanItem {

    public Video(String name,String type) {
        super(name, type);
    }


    public String toString() {
        return "    "+ name + "   " + type;
    }

}
