public class Passenger extends AbstractPerson {

    private int numberOfBags;

    public Passenger(String _name, int _numberOfBags) {
        super(_name);
        this.numberOfBags = _numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
