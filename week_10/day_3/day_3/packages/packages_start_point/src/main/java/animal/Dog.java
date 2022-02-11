package animal; // we have two packages, animal and human. we organise our code into packages in java

public class Dog {

     String name; //no modifier here, we have public, protected, no modifier and private.

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected String bark() {
        //to play around
        //to create a new dog here, you do Dog flash = new Dog("dogs name because on line 7, dog takes String name");
        //then do: flash.speak();
        return "Bark!";
    }
}
