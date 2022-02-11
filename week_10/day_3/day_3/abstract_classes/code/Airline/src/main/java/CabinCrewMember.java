public class CabinCrewMember extends AbstractPerson {

    private String rank;

    public CabinCrewMember(String _name, String _rank){
    super(_name);
    this.rank = _rank;

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
