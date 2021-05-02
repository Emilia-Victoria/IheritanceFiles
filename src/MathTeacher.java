//This is the subclass that extends the Teacher class
public class MathTeacher extends Teacher{
    //All the attributes from the Teacher class are carried over
    //This attribute is unique to the MathTeacher class
    String subject = "Math";

    public MathTeacher(String name, String schoolName){
        super(name, schoolName);
    }
    //As the getters are carried over from the Teacher class,
    //there's only need to write one for the new attribute
    public String getSubject() {
        return subject;
    }
}

class Main {
    public static void main(String[] args) {
        //Example of inheritance from the Teacher class to the MathTeacherclass
        MathTeacher Peter = new MathTeacher("Peter","Aurehøj");

        //We can get Peter's job title, even though it isn't found nor mentioned in the MathTeacher class,
        //as it is inherited from the Teacher class
        System.out.println(Peter.getJob());
    }
}
