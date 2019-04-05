package practice07;

public class Klass {

    private int number_;

    public Klass(int number) {
        number_ = number;
    }

    public int getNumber() {
        return number_;
    }

    public String getDisplayName() {
        return "Class " + number_;
    }
}
