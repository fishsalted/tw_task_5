package practice06;

public class Teacher extends practice01.Person {

    private int klass_;

    public Teacher(String name, int age) {
        super(name,age);
        klass_ = 0;
    }
    public Teacher(String name, int age, int klass) {
        super(name,age);
        klass_ = klass;
    }

    public int getKlass() {
        return klass_;
    }

    public String introduce() {
        if(klass_ == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else {
            return super.introduce() + " I am a Teacher. I teach Class " + klass_ + ".";
        }
    }

}
