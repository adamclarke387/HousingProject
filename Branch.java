import java.util.*;

/**
 * This is the Branch class. The methods of this class return specific statistics
 * @author Adam Clarke
 */
public class Branch {

    String branchName;
    ArrayList<Sale> saleList;

    /**
     * This is the constructor that links the field variable with parameter value
     * @param branchName This means the specific Branch name
     */
    public Branch(String branchName) {
        this.branchName = branchName;
        saleList = new ArrayList<>();

    }
    @SuppressWarnings("UnusedReturnValue")
    public boolean addSale(Sale sale){
        return saleList.add(sale);

    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Sale> getSaleList() {
        return saleList;
    }

    /**
     * @return String representation of a branch
     */
    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                ", saleList=" + saleList +
                '}';
    }

    // Main method created for testing
    public static void main(String[] args) {

        BranchhighSale();
        BranchaverageSale();
    }
    public static void BranchhighSale(){
        Sale Testone = new Sale(54, "SW3 LW2", 43000.23, "August", 1965);
        Sale Testtwo = new Sale(22, "KG8 DG5", 120300.40, "September", 1978);

        if(Testone.houseValue> Testtwo.houseValue){
            System.out.println("Sale with highest sale value: " + Testone);
        }
        else{
            System.out.println("Sale with highest sale value: " +Testtwo);
        }
    }
    public static void BranchaverageSale(){
        List<Sale> saleList = new ArrayList<>();
        Sale Testone = new Sale(145, "NS5 WT4", 52300.23, "March", 1945);
        Sale saleOne = new Sale(92, "SE2 LS7", 312000.45, "February", 2013);
        saleList.add(Testone);
        saleList.add(saleOne);
        double avg = (Testone.houseValue + saleOne.houseValue)/saleList.size();
        System.out.println("The average of all sales: " +avg);
    }

}
