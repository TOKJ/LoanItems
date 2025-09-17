package LoanItems01;

public class LoanTest01 {

    public static void main(String[] args) {
        ScannerHelperClass helperClass = new ScannerHelperClass();

        System.out.println("\nWelcome to theXX\n\n");
        System.out.println("Let's register some animals!");

        LoanItem[] loanItems = helperClass.askAmountOfItems();

        System.out.println("The following pets are now registered: ");
        for (LoanItem loanItem : loanItems) {
            System.out.println(loanItem);
        }
    }
}
}
