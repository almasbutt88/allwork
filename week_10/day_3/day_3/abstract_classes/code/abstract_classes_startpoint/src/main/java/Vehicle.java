public abstract class Vehicle { //thats how you make a class abstract

    private String model;
    private int numberOfWheels;

    public Vehicle(String model, int numberOfWheels) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

    public String drivingInstructions(){
        return "Turn the key to start.";
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String startEngine() {
        return "Vrrr. Engine is running.";
    }

    public abstract String boardingInstructions(); //this is how you force a method from abstract class to child class
    }// abstract method cannot have a body as the child must override the method anyway so its pointless
