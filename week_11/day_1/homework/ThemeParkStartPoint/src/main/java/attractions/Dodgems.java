package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() <12){
            return 4.50/2;
        }

        return 4.50;
    }


}
