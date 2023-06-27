package controller;

import service.Service;
import service.StudentsGroupService;
import view.StudentsGroupView;
import view.View;

public class StudendsGroupController extends Controller {

    public StudendsGroupController(App app) {
        super(app);
        super.setView(new StudentsGroupView()) ;
        super.setService(new StudentsGroupService(this));
    }


    @Override
    public void show(String message) {

    }

    @Override
    public String showAll() {
        return getService().showAll();
    }

    @Override
    public void create() {

    }

    @Override
    public Object select(String message) {
        return null;
    }
}
