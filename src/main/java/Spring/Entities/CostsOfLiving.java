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

    //Constructors

    public CostsOfLiving() {
    }

    public CostsOfLiving(String countryName, float incomeTax, int fixedCosts) {
        this.countryName = countryName;
        this.incomeTax = incomeTax;
        this.fixedCosts = fixedCosts;
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
}
