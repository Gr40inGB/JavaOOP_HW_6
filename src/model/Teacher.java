package model;

public class Teacher extends User {
    private static Long idGenerator = 1l;

    private Disciplines discipline;

    public Teacher(String name, String lastName, Integer bornYear, Disciplines discipline) {
        super(idGenerator++, name, lastName, bornYear);
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "techId " + super.getId()  + " " + super.toString();

    }
}
