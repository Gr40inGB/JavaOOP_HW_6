package view;

import communicationsAxes.Axes;

public abstract class View implements ViewServices {
    private boolean working;



    public View() {
        this.working = true;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean setupStatus) {
        this.working = setupStatus;
    }
}
