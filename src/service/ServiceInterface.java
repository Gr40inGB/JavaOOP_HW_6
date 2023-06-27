package service;

import controller.Controller;
import model.UniversityEntry;

public interface ServiceInterface<T extends UniversityEntry> {

    Controller getController();
    public T getSelected(Long selectId);

    public void put(T entry);

}
