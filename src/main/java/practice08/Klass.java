package practice08;

public class Klass extends practice07.Klass {

    protected Student leader_;

    public Klass(int number) {
        super(number);
    }

    public void assignLeader(Student student) {
        leader_ = student;
    }

    public Student getLeader() {
        return leader_;
    }
}
