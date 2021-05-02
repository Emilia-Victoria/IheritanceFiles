//This is the super class
public class Teacher {
    //Attributes that all Teacher objects and objects extending the Teacher object will have
    private String name;
    private String job = "Teacher";
    private String schoolName;

    //Constructor
    public Teacher(String name, String schoolName){
        this.name = name;
        this.schoolName = schoolName;
    }
    //Methods that all Teacher objects and objects extending the Teacher object can call
    public String getJob() {
        return job;
    }
    public String getSchoolName() {
        return schoolName;
    }
}
