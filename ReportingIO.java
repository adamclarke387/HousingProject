import java.util.Scanner;

public class ReportingIO {

    static Reporting reportOne = new Reporting();

    public static void main(String[] args) {


        Scanner inputOne = new Scanner(System.in);
        int data;
        do {
            System.out.println("""
                            
                    USER INTERFACE

                    1) Data on Sale
                    2) Data on Branch
                    3) Report Statistics
                    4) End Program (EXIT)
                    
                    Select Options from 1-4 :""");
            data = inputOne.nextInt();
            inputOne.nextLine();

            if (data == 1 || data == 2) {

                addSale();
            }

            else if (data == 3) {
                Scanner inputTwo = new Scanner(System.in);
                int Selectdata;
                System.out.println("""
                Choose specific statistical report:-
                                
                1) The Branch with highest average value sale for a specific year
                2) The sale with the largest value
                3) Sales larger than a specific amount
                
                """);
                Selectdata = inputTwo.nextInt();

                if (Selectdata == 1) {

                    Reporting.SalesAverage();

                } else if (Selectdata == 2) {

                    Reporting.SelHighestValue();

                } else if (Selectdata == 3) {

                    System.out.println("Type in Amount:");
                }else{
                    System.out.println("That input was not recognised");
                }


            }

        } while(data != 4) ;
        System.out.println("Program exited");
    }

    public static void addSale() {
        Scanner input9 = new Scanner(System.in);
        System.out.println("Enter Branch Name:");
        String branchName = input9.nextLine();
        System.out.println("Enter House Number:");
        int houseNumber = input9.nextInt();
        input9.nextLine();
        System.out.println("Enter postcode:");
        String postcode = input9.nextLine();
        System.out.println("Enter House Value:");
        double houseValue = input9.nextDouble();
        System.out.println("Enter the month:");
        String month = input9.nextLine();
        input9.nextLine();
        System.out.println("Enter the year:");
        int year = input9.nextInt();
        input9.nextLine();
        Sale newSale = new Sale(houseNumber, postcode, houseValue, month, year);
        Branch newBranch = new Branch(branchName);
        System.out.println(newBranch);
        System.out.println(newSale);
        reportOne.SpecificBranch(branchName, newSale);
    }
}