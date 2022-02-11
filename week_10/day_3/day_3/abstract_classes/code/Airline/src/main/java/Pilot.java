public class Pilot extends AbstractPerson {

    private String licenseNumber;
    private String rank;
    public Pilot(String _name, String _rank, String _licenseNumber){
        super(_name);
        this.rank = _rank;
        this.licenseNumber = _licenseNumber;
    }



    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public String flyPlane() {
        return "The Pilot is now flying this plane";
    }
}
