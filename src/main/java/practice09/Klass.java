package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass extends practice08.Klass {

    protected List<practice08.Student> student_list_;

    public Klass(int number) {
        super(number);
        student_list_ = new ArrayList<>();
    }

    public void appendMember(practice08.Student student) {
        for(practice08.Student stu : student_list_) {
            if(stu.equals(student)) {
                return;
            }
        }
        student_list_.add(student);
    }

    public void assignLeader(practice08.Student student) {
        for(practice08.Student stu : student_list_) {
            if(stu.equals(student)) {
                leader_ = student;
                return;
            }
        }
        System.out.print("It is not one of us.\n");
    }

}
