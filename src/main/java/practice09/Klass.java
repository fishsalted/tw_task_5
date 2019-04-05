package practice09;

import practice08.Student;

import java.util.ArrayList;
import java.util.List;

public class Klass extends practice08.Klass {

    private List<Student> student_list_;

    public Klass(int number) {
        super(number);
        student_list_ = new ArrayList<>();
    }

    public void appendMember(Student student) {
        for(Student stu : student_list_) {
            if(stu.equals(student)) {
                return;
            }
        }
        student_list_.add(student);
    }

    public void assignLeader(Student student) {
        for(Student stu : student_list_) {
            if(stu.equals(student)) {
                leader_ = student;
                return;
            }
        }
        System.out.print("It is not one of us.\n");
    }

}
