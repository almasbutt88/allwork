public class Student extends Person {


    private String moduleTeam; //now...
    public Student(String name, String cohort, String _moduleTeam) {  //super constructor, super being the class you inherit from
        super(name, cohort); //this inherits everything you put in the person class. and you can remove all the methods below.
        this.moduleTeam = _moduleTeam;
        //this class was a replica of Person class and had all the methods we put there, then when we inherited the super
        //we removed all the methods as the inheritance means they are now all there.
    }//
    public String talk(String _language){// access modifier, return and method name has to be the same
        return "I love "+ _language;
    };

}
