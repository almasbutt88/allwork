import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers; //in <> you enter the type in capital when working with ArrayList
    // storage type can only be a class which is why its capital,
    // this allows you to use the functions built into class types. primitive types have no methods
    // but object types do

    public NumberList(){
        this.numbers = new ArrayList<>(); //don't need to put Integer here between <>

    }

    public int getNumberCount(){
        return this.numbers.size();
    }


    public void addNumber(int numberToAdd) { //int primitive instead of Integer object
    numbers.add(numberToAdd); //remember, numbers is your arraylist. so you do dot add method
        //indexOf function is a search function.


    }

    public int getNumberAtIndex(int index) { //this function takes index number as arg, we can call it x if we want
        return this.numbers.get(index);
    }

    public int getTotal() {
        //return this.numbers.size();
        int total = 0;
        for (int i = 0;i<this.getNumberCount();i++;) //instead of getNumberCount you can use this.numbers.size();
            //in the line above, starting count at 0, until i is under the size of the array (this), increment the for loops by 1
        total += getNumberAtIndex(i);
        numberOfEntries++; //this does the same as .size,

        for(Integer number: this.numbers)// type is int, what do we want to loop through? numbers. it assumes you want to start at 0 and go to the end of the array.
        { //type     variable // on line above. if your arraylist was type Fruits, then it would read Fruits number: this.numbers
            total += number;
            counter++;
        }
        return total;
     System.out.println("Count " + numberOfEntries);
    return total;
    }
}
