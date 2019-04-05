package practice07;

public class Student extends practice01.Person {

    private Klass klass_;

    public Student(String name, int age, Klass klass) {
        super(name,age);
        klass_ = klass;
    }

    public Klass getKlass() {
        return klass_;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at " + klass_.getDisplayName() + ".";
    }

}
