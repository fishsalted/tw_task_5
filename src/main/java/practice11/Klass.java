package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number_;
    private Student leader_;
    private List<Student> student_list_;
    private List<Teacher> teacher_list_;
    
    public Klass(int number) {
        number_ = number;
        student_list_ = new ArrayList<>();
        teacher_list_ = new ArrayList<>();
    }

    public void registerTeacher(Teacher teacher) {
        for(Teacher tec : teacher_list_) {
            if(tec.equals(teacher)) {
                return;
            }
        }
        teacher_list_.add(teacher);
    }

    public void appendMember(Student student) {
        for(Student stu : student_list_) {
            if(stu.equals(student)) {
                return;
            }
        }
        student_list_.add(student);
        for(Teacher tec : teacher_list_) {
            tec.notify(student, this);
        }
    }

    public void assignLeader(Student student) {
        for(Student stu : student_list_) {
            if(stu.equals(student)) {
                leader_ = student;
                for(Teacher tec : teacher_list_) {
                    tec.notify(student, this);
                }
                return;
            }
        }
        System.out.print("It is not one of us.\n");
    }

    public int getNumber() {
        return number_;
    }

    public Student getLeader() {
        return leader_;
    }

    public String getDisplayName() {
        return "Class " + number_;
    }

    public boolean isIn(Student student) {
        for(Student stu : student_list_) {
            if(stu.equals(student)) {
                return true;
            }
        }
        return false;
    }
}
