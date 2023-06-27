package model;

public class Student extends User {
    static Long idGenerator = 1l;
    private StudentGroup studentGroup;

    public Student(String name, String lastName, Integer bornYear, StudentGroup studentGroup) {
        super(idGenerator++, name, lastName, bornYear);
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "stId " + super.getId() + " " + super.toString();
    }
}
