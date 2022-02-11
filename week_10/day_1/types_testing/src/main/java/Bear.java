public class Bear {
    private String name;
    private int age;
    private double weight;

    public Bear(String bearName, int inputAge, double inputWeight) {
        this.name = bearName;
        this.age = inputAge;
        this.weight = inputWeight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public double getWeight(){
        return weight;
    }


    public boolean readyToHibernate(){
        if(this.weight >= 500) {
            return true;
        }
        else{
            return false; //you can just return false instead of having the else statement
            //command alt L will delete empty lines
        }
    }
}
