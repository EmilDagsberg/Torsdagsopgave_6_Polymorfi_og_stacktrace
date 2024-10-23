import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> canTeach = new ArrayList();
    private ArrayList<String> currentCourses = new ArrayList();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    // 3.5
    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}