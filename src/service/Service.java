package service;

import communicationsAxes.Axes;
import controller.Controller;
import model.UniversityEntry;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public abstract class Service<T extends UniversityEntry> implements ServiceInterface, Axes {

    /**
     * Long - entries ID, T - student / teacher / group
     */
    Map<Long, T> entriesMap;
    Controller controller;


    public Service(Controller controller) {
        this.controller = controller;
        this.entriesMap = new HashMap<>();
    }


    @Override
    public Controller getController() {
        return controller;
    }

    @Override
    public UniversityEntry getSelected(Long selectId) {
        return entriesMap.get(selectId);

    }

    @Override
    public void put(UniversityEntry entry) {
        entriesMap.put(entry.getId(),(T) entry);
    }
}
