package controller;

import service.Service;
import view.View;

public interface ControllersInterface {
    View getView();

    Service getService();
}
