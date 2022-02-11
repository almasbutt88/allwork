public class Person {
    private String name;
    private String cohort;

    public Person(String _name, String _cohort) { //constructor, we will need at least two properties called name and cohort
    this.name = _name; //only place where you definitely should use THIS, within the constructor
    this.cohort = _cohort;
    }

    public String getName() { //option control space for auto import of assert equal
        return name; //only one name inside this class, so you dont need to say THIS.name
    }

    public String getCohort() {
        return cohort;
    }

    public void setName(String _name) { //_name means its incoming from another class or file
        name = _name;
    }

    public void setCohort(String _cohort) {
        cohort = _cohort;
    }


    public String talk(String _language) {
        return "I love " + _language;
    }
}
