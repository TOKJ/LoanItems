package LoanItems01;

import java.util.Scanner;

public class ScannerHelperClass {

    //Metode til hvor mange "LoanItems"
    public LoanItem[] askAmountOfItems() {
        Scanner scanner = new Scanner(System.in);

        int amountOfItems = 0;
        int maxAmountOfItems = 25;


        while (amountOfItems <= 0 || amountOfItems > maxAmountOfItems) {
            System.out.print("Please write the amount of items for registering: ");

            if (scanner.hasNextInt()) {
                amountOfItems = scanner.nextInt();
                scanner.nextLine();

                if (amountOfItems <= 0) {
                    System.out.println("Please only input a number above 0.");
                } else if (amountOfItems > maxAmountOfItems) {
                    System.out.println("Please only input a max of " + maxAmountOfItems + " items for loan!");
                }
            } else {
                System.out.println("Error: please input a whole number!");
                //scanner.next fjerner forkert input.
                scanner.nextLine();
            }
        }



        LoanItem[] loanItemRegister = new LoanItem[amountOfItems];

        for (int i = 0; i < amountOfItems; i++) {
            System.out.println("\n\nEnter title of item: ");
            System.out.print("Item: " + (i + 1) + "\t  -\t" + "Enter title: ");
            String name = scanner.nextLine();
            System.out.println();


            String type = "";

            boolean validType = false;

            while (!validType) {
                System.out.println("The following item types are allowed: Book, Video!");
                System.out.print("Please write type for " + name + ": ");
                type = scanner.nextLine();
                System.out.println();

                if (type.equalsIgnoreCase("Book") || type.equalsIgnoreCase("Video")) {
                    validType = true;
                } else {
                    System.out.println("Error: please only input one of the following types: Book, Video!");
                }
            }


            if (type.equalsIgnoreCase("Book")) {
                int listNumber = loanItemRegister[i].getListNumber();
                listNumber++;
                loanItemRegister[i] = new Book(name, "Book", listNumber);


            } else if (type.equalsIgnoreCase("Video")) {
                int listNumber = loanItemRegister[i].getListNumber();
                listNumber++;
                loanItemRegister[i] = new Video(name, "Video", listNumber);
            }
        }

        return loanItemRegister;


    }
}



