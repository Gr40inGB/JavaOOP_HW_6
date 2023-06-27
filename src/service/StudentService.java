package service;

import controller.Controller;

public class StudentService extends Service{

    public StudentService(Controller controller) {
        super(controller);
    }

    @Override
    public void show(String message) {

    }

    @Override
    public String showAll() {
        return null;
    }

    @Override
    public void create() {

    }

    @Override
    public Object select(String message) {
        return null;
    }
}
