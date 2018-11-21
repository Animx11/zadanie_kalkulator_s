package Spring.RestClientForNbpApi.NbpEntities;

public class Rates {

    private String no;
    private String effectiveDate;
    private float mid;

    //Constructors

    public Rates() {
    }

    public Rates(String no, String effectiveDate, float mid) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    //Getters and setters

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public float getMid() {
        return mid;
    }

    public void setMid(float mid) {
        this.mid = mid;
    }
}
