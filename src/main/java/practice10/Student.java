package practice10;

public class Student extends practice08.Student {

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age, klass);
        klass.appendMember(this);
    }

}
