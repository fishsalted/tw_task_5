package practice08;

public class Person extends practice01.Person {

    private int id_;

    public Person(int id, String name, int age) {
        super(name, age);
        id_ = id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Person) {
            return this.id_ == ((Person)obj).id_;
        }
        return false;
    }

}
