package service;


import controller.Controller;
import model.StudentGroup;
import model.UniversityEntry;

public class StudentsGroupService extends Service{

    public StudentsGroupService(Controller controller) {
        super(controller);
    }

    @Override
    public void show(String message) {

    }

    @Override
    public String showAll() {
        StringBuilder sb = new StringBuilder("All groups:\n");
        for( Object o : entriesMap.values()){
            sb.append((StudentGroup) o);
        }
        return sb.toString();
    }

    @Override
    public void create() {
        StudentGroup tempLink = getController().getApp().

    }

    @Override
    public StudentGroup select(String message) {
        return null;
    }


}
