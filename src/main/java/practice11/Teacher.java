package practice11;

import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> classes_;

    public Teacher(int id, String name, int age) {
        super(id, name,age);
        classes_ = new LinkedList<>();
    }
    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name,age);
        classes_ = classes;
        for(Klass klass : classes) {
            klass.registerTeacher(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes_;
    }

    public String introduce() {
        System.out.println(1);

        if(classes_.isEmpty()) {
            System.out.println(1);

            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        System.out.println(2);

        StringBuilder classes_str = new StringBuilder(String.valueOf(classes_.get(0).getNumber()));
        for(int i = 1;i < classes_.size(); ++i) {
            classes_str.append(", ").append(classes_.get(i).getNumber());
        }
        return super.introduce() + " I am a Teacher. I teach Class " + classes_str + ".";
    }

    public String introduceWith(Student student) {
        for(Klass klass : classes_) {
            if(klass == student.getKlass()) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        for(Klass klass : classes_) {
            if(klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public void notify(Student student, Klass klass) {
        String print_str = "I am " + getName() + ". I know " + student.getName();
        if(klass.getLeader() == null || student != klass.getLeader()) {
            System.out.println(print_str + " has joined " + klass.getDisplayName() + ".");
        }else {
            System.out.println(print_str + " become Leader of " + klass.getDisplayName()  + ".");
        }
    }

}
