package controller;

public class App {

    Controller studenstGroupsController;
    Controller teachersController;
    Controller studendsController;

    public App() {
        studenstGroupsController = new StudendsGroupController(this);
        teachersController = new TeachersController(this);
        studendsController = new StudentsController(this);
    }

    public void startApp(){
        studenstGroupsController.getView().start();
    }
}
