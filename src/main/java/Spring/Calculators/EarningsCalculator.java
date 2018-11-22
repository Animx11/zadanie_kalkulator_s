package Spring.Calculators;

public class EarningsCalculator {

    public float calculateEmployeeEarning(float currencyValue, float incomeTax, int fixedCosts, float dailyEarnings) {

        float monthlyEarnings;

        monthlyEarnings = (dailyEarnings * 22 * (1 - incomeTax) - fixedCosts) * currencyValue;

        return monthlyEarnings;
    }

}
