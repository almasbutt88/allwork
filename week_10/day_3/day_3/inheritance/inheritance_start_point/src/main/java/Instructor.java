public class Instructor extends Person { //can only extend one class at a time, here we are inheriting Person class

 private String moduleTeam;

 public Instructor(String _name, String _cohort, String _moduleTeam){
     super(_name, _cohort);
     moduleTeam = _moduleTeam;
 }

 public String talk(String _language){
     return "I love teaching " + _language + moduleTeam; //not _moduleTeam;
 }

    }