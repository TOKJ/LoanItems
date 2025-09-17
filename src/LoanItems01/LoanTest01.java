package LoanItems01;

public class LoanTest01 {

    public static void main(String[] args) {
        ScannerHelperClass helperClass = new ScannerHelperClass();
        // Vi kalder på vores metode i ScannerHelperClass
        System.out.println("\nWelcome to the web-library!\n\n");
        System.out.println("Let's register our materials.");

        LoanItem[] loanItems = helperClass.askAmountOfItems();
        // Vi kalder på vores array
        System.out.println("The following items are now registered: ");
        System.out.println("--------------------");
        System.out.println("ID   TYPE         TITLE");


        // Vores int count holder styr på hvad nr. vores objekt er i vores liste.
        // Hver gang vi indtaster et nyt objekt, incrementer den count. Denne bruger vi til
        // at vise hvor tingene er på listen til sidst i vores formatering.
        int count = 1;
        for (LoanItem loanItem : loanItems) {
            System.out.print(count);
            System.out.println(loanItem);
            count++;
        }
        System.out.println("\n -- Thank you for registering --");
    }
}

