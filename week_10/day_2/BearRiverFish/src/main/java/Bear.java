import java.util.ArrayList;

public class Bear {
    private String name; //its to stop other code from accessing it and changing it
    private ArrayList<Salmon> belly;
    public Bear(String bearName) { //constructor auto created, we renamed bearName
        this.name = bearName;
        this.belly = new ArrayList<Salmon>(); //belly class has an ArrayList of salmon
    }

    public int foodCount() {
        return belly.size();
    }

    /**
     * documentation by doing forward slash star star
     * @param salmon < this  called a method descriptor
     */
    public void eat(Salmon salmon) { //Salmon is type, salmon is variable
        belly.add(salmon);
    }

    public void sleep() {
        belly.clear();
    }

    public void eatFishFromRiver(River river){
        Salmon salmon = river.removeFish();
        belly.add(salmon);
    }
}