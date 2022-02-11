package people;

import behaviours.ISecurity;
import behaviours.ITicketed;



public class Visitor implements ITicketed, ISecurity {
    private Visitor visitor;

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }

}
