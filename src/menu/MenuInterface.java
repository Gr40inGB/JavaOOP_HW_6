package menu;

public interface MenuInterface {
    public void addMenuOperations();

    public String getMenuName();

    public String showMenu();

    public Integer menuSize();

    public void runSelected(int index);
}
