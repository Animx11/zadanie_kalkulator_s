package Spring.Entities;


import javax.persistence.*;

@Entity
@Table(name = "Costs_of_living", uniqueConstraints = {
        @UniqueConstraint(columnNames = "Country_name")
})
public class CostsOfLiving {

    @Id
    @Column(name = "Country_name")
    private String countryName;

    @Column(name = "Income_tax")
    private float incomeTax;

    @Column(name = "Fixed_costs")
    private int fixedCosts;

    @Column(name = "Currency_code")
    private String currencyCode;

    @Column(name = "Currency_table")
    private char currencyTable;

    //Constructors

    public CostsOfLiving() {
    }

    public CostsOfLiving(String countryName, float incomeTax, int fixedCosts) {
        this.countryName = countryName;
        this.incomeTax = incomeTax;
        this.fixedCosts = fixedCosts;
    }

    public CostsOfLiving(String countryName, float incomeTax, int fixedCosts, String currencyCode, char currencyTable) {
        this.countryName = countryName;
        this.incomeTax = incomeTax;
        this.fixedCosts = fixedCosts;
        this.currencyCode = currencyCode;
        this.currencyTable = currencyTable;
    }

    //Getters and setters


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(float incomeTax) {
        this.incomeTax = incomeTax;
    }

    public int getFixedCosts() {
        return fixedCosts;
    }

    public void setFixedCosts(int fixedCosts) {
        this.fixedCosts = fixedCosts;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public char getCurrencyTable() {
        return currencyTable;
    }

    public void setCurrencyTable(char currencyTable) {
        this.currencyTable = currencyTable;
    }
}
