package controller;

import communicationsAxes.Axes;
import model.StudentGroup;
import service.Service;
import view.View;

public abstract class Controller implements ControllersInterface, Axes {
    private App app;

    private View view;

    public Controller(App app) {
        this.app = app;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setService(Service service) {
        this.service = service;
    }

    private Service service;

    @Override
    public View getView() {
        return view;
    }

    @Override
    public Service getService() {
        return service;
    }
}
