package practice01;

public class Person {

    private int age_;
    private String name_;

    public Person(String name, int age) {
        age_ = age;
        name_ = name;
    }

    public String getName() {
        return name_;
    }

    public int getAge() {
        return age_;
    }

    public String introduce() {
        return "My name is " + name_ + ". I am " + age_ + " years old.";
    }
}
