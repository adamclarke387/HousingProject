/**
 * This is the Sale class with fields, constructors and getters and setters
 * @author Adam Clarke
 */
public class Sale {

    int houseNumber;
    String postcode;
    double houseValue;
    String month;
    int year;

    /**
     * This is the constructor that links the field variable with parameter value
     * @param houseNumber This means the specific house number
     * @param postcode This means the specific postcode
     * @param houseValue This means the specific house
     * @param month This means the specific house that was sold
     * @param year This means the specific year of sale for the house
     */
    public Sale(int houseNumber, String postcode, double houseValue, String month, int year) {
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.houseValue = houseValue;
        this.month = month;
        this.year = year;
    }

    /**
     * @return String representation of a sale
     */
    @Override
    public String toString() {
        return "Sale{" +
                "houseNumber=" + houseNumber +
                ", postcode='" + postcode + '\'' +
                ", houseValue=" + houseValue +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public double getHouseValue() {
        return houseValue;
    }
    public void setHouseValue(double houseValue) {
        this.houseValue = houseValue;
    }

    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}



