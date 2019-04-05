package practice11;

public class Student extends Person  {

    protected Klass klass_;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        klass_ = klass;
        klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass_;
    }

    public String introduce() {
        if(klass_.getLeader() != this) {
            return super.introduce() + " I am a Student. I am at " + klass_.getDisplayName() + ".";
        }else {
            return super.introduce() + " I am a Student. I am Leader of "+ klass_.getDisplayName() + ".";
        }
    }

}
