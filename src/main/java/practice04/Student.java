package practice04;

public class Student extends Person {

    private int klass_;

    public Student(String name, int age, int klass) {
        super(name,age);
        klass_ = klass;
    }

    public int getKlass() {
        return klass_;
    }

    public String introduce() {
        return super.basicIntroduce() + " I am a Student. I am at Class " + klass_ + ".";
    }

}
