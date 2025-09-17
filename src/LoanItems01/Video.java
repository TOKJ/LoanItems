package LoanItems01;

class Video extends LoanItem {

    public Video(String name,String type) {
        super(name, type);
    }


    @Override
    public String toString() {
        return "        \n▸ Name: " + name + "        \n▹ Type: " + type + "";
    }

}
