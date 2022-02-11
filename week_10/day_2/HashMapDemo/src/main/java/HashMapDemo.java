import java.util.HashMap;

public class HashMapDemo {

    public static void main (String[] args){ //static means it doesnt belong to an object. it doesnt require an instantiation further down.

//        HashMap<String, String>  favouriteFruits= new HashMap(); //key value are gonna be strings
//
//        favouriteFruits.put("Alice", "apple");
//        favouriteFruits.put("Sarah", "banana");
//        favouriteFruits.put("Almas", "cherry");
//        favouriteFruits.get("Almas"); //get is a Java method, output will be cherry

        HashMap<String, Integer> ages; //we are declaring ages which is a variable of type HashMap
        ages = new HashMap(); //key value are gonna be string and integer on line above. Your second object can be an ArrayList.

        ages.put("Alice", 23);
        ages.put("Sarah", 32);
        ages.put("Almas", 33);
        ages.get("Almas"); //will output 33
    }


}
