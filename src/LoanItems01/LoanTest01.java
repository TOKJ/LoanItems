package LoanItems01;

public class LoanTest01 {

    public static void main(String[] args) {
        ScannerHelperClass helperClass = new ScannerHelperClass();

        System.out.println("\nWelcome to the web-library!\n\n");
        System.out.println("Let's register our materials.");

        LoanItem[] loanItems = helperClass.askAmountOfItems();

        System.out.println("The following items are now registered: ");

        int count = 1;
        for (LoanItem loanItem : loanItems) {
            System.out.println("ITEM no. " + count);
            System.out.println(loanItem);
            count++;
        }
    }
}

