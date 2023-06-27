package model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup extends UniversityEntry {
    static Long idGenerator = 1l;
    private Teacher groupTeacher;
    private List<Student> studentList;

    public StudentGroup(Teacher groupTeacher, List<Student> studentList) {
        super(idGenerator++);
        this.groupTeacher = groupTeacher;
        this.studentList = studentList;
    }

    public StudentGroup(Teacher groupTeacher) {
        super(idGenerator++);
        this.groupTeacher = groupTeacher;
        this.studentList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student group №").append(super.getId()).append(System.lineSeparator());
        stringBuilder.append("\t").append(this.groupTeacher).append(System.lineSeparator());
        for (Student s : this.studentList) {
            stringBuilder.append("\t").append("\t").append(s).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    public Teacher getGroupTeacher() {
        return groupTeacher;
    }

    public void setGroupTeacher(Teacher groupTeacher) {
        this.groupTeacher = groupTeacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public Long getGroupId() {
        return getId();
    }
}
