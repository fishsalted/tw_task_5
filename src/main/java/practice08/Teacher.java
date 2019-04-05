package practice08;

public class Teacher extends Person {

    private Klass klass_;

    public Teacher(int id, String name, int age) {
        super(id, name,age);
        klass_ = null;
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name,age);
        klass_ = klass;
    }

    public Klass getKlass() {
        return klass_;
    }

    public String introduce() {
        if(klass_ == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else {
            return super.introduce() + " I am a Teacher. I teach " + klass_.getDisplayName() + ".";
        }
    }

    public String introduceWith(Student student) {
        if(klass_ == null || klass_ != student.getKlass()) {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }else {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
    }

}
