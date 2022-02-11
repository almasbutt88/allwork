import java.util.ArrayList;

public class River {
    public class River {
        private ArrayList<Salmon> fish;

        //constructor

        public River() {
            this.fish = new ArrayList<Salmon>(); //fish is an arraylist of river
        }

        public void addFish(Salmon salmon) {
            this.fish.add(salmon);
        }

        public int fishCount() {
            return this.fish.size();
        }

        public Salmon removeFish() {
            return this.fish.remove(0);


        }

    }
}