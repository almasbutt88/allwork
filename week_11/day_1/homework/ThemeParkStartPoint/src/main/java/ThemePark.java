import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark{

    private ArrayList<Attraction>attractions = new ArrayList<Attraction>();
    public ArrayList<Stall>stalls = new ArrayList<Stall>();


    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);

    }
    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList allReviewed = new ArrayList();
        allReviewed.addAll(attractions);
        allReviewed.addAll(stalls);
        return allReviewed;
    }


}
