package LoanItems01;

public class LoanTest01 {

    public static void main(String[] args) {
        ScannerHelperClass helperClass = new ScannerHelperClass();

        System.out.println("\nWelcome to the web-library!\n\n");
        System.out.println("Let's register our materials.");

        LoanItem[] loanItems = helperClass.askAmountOfItems();

        System.out.println("The following items are now registered: ");
        System.out.println("--------------------");
        System.out.println("ID   TYPE         TITLE");

        int count = 1;
        for (LoanItem loanItem : loanItems) {
            System.out.print(count);
            System.out.println(loanItem);
            count++;
        }
        System.out.println("\n -- Thank you for registering --");
    }
}

