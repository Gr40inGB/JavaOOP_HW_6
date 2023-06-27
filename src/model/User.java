package model;

import java.text.SimpleDateFormat;
import java.time.Year;

public abstract class User extends UniversityEntry {
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
    private String name;
    private String lastName;
    private Integer bornYear;



    public User(Long id, String name, String lastName, Integer bornYear) {
        super(id);
        this.name = name;
        this.lastName = lastName;
        this.bornYear = Year.now().getValue() > bornYear ? bornYear : Year.now().getValue();
    }

    public Integer getAge() {
        return Year.now().getValue() - this.bornYear;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + getAge() + " y.o.";
    }
}
