package model;

public abstract class UniversityEntry implements UniversityEntryInterface {
    Long id;

    public UniversityEntry(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }
}
