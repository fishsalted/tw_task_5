package practice10;

public class Klass extends practice09.Klass {

    public Klass(int number) {
        super(number);
    }

    public boolean isIn(practice08.Student student) {
        for(practice08.Student stu : student_list_) {
            if(stu.equals(student)) {
                return true;
            }
        }
        return false;
    }

}
