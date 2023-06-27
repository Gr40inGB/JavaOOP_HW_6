package controller;

import model.Teacher;

public class App {

    Controller studenstGroupsController;
    Controller teachersController;
    Controller studendsController;

    public Controller getStudenstGroupsController() {
        return studenstGroupsController;
    }

    public Teacher getTeacher(){
        return teachersController.getService().getSelected();
    }

    public Controller getTeachersController() {
        return teachersController;
    }

    public Controller getStudendsController() {
        return studendsController;
    }

    public App() {
        studenstGroupsController = new StudendsGroupController(this);
        teachersController = new TeachersController(this);
        studendsController = new StudentsController(this);
    }

    public void startApp(){
        studenstGroupsController.getView().start();
    }
}
