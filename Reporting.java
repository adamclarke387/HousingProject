import java.util.*;

/**
 * This is the Reporting class.
 */
public class Reporting {
    ArrayList<Branch> branches;

    public Reporting() {
        this.branches = new ArrayList<>();
    }

    public void SpecificBranch(String branchName, Sale saleToAdd){

        boolean bool = true;

        if(this.branches.isEmpty()) {
            Branch branchThree = new Branch(branchName);
            branchThree.addSale(saleToAdd);
            this.branches.add(branchThree);
        }
        else{
            for (Branch branch : this.branches) {
                if(Objects.equals(branchName, branch.getBranchName())){
                    branch.addSale(saleToAdd);
                } else {
                    bool = false;
                }
            }
            if(!bool){
                Branch branchThree = new Branch(branchName);
                branchThree.addSale(saleToAdd);
                this.branches.add(branchThree);
            }
        }

    }
    // Methods for Testing
    public static void main(String[] args) {
        SelHighestValue();
        SalesAverage();
    }

    public static void SelHighestValue() {

        Sale Testone = new Sale(97, "N15 ES2", 150000, "September", 2020);
        Sale Testtwo = new Sale(14, "VN7 YS5", 132450, "February", 2005);

        if(Testone.houseValue> Testtwo.houseValue){
            System.out.println("House with the largest sale value: " + Testone);
        }
        else{
            System.out.println("House with the largest sale value: " + Testtwo);
        }
    }

    public static void SalesAverage(){
        List<Sale> saleList = new ArrayList<>();
        Sale Testone = new Sale(32, "L15 TS1", 156900, "January", 2010);
        Sale Testtwo = new Sale(41, "NW10 TH3", 90000, "August", 2005);
        saleList.add(Testone);
        saleList.add(Testtwo);
        double avg = (Testone.houseValue + Testtwo.houseValue)/saleList.size();
        System.out.println("Overall average sale: " +avg);
    }
}

