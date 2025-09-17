package LoanItems01;

public class LoanTest01 {

    public static void main(String[] args) {
        ScannerHelperClass helperClass = new ScannerHelperClass();

        System.out.println("\nWelcome to the Pet Adoption Center\n\n");
        System.out.println("Let's register some animals!");

        Pet[] pets = helperClass.askAmountOfPets();

        System.out.println("The following pets are now registered: ");
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
}
