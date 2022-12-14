package week1.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    private List<Student> students;

    public ListPractice() {
        students = new ArrayList<>();
        NameGenerator g = new NameGenerator();
        for(int i = 0; i<99;i++) {
            this.students.add(new Student(1,g.generateName(),"git.korea"));
        }
    }

    // 멋사자 2기 학생의 이름이 들어있는 리스트를 리턴하는 메소드
    public List<Student> getStudentList(){
        return this.students;
    }
}
