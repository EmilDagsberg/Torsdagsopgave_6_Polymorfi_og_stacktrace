import java.util.ArrayList;

// 3.6
public class Main {
    public static void main(String[] args) {
        ArrayList<String> s1Passed = new ArrayList<>();
        s1Passed.add("Chemistry");
        s1Passed.add("Computer Science");
        s1Passed.add("Java 1.0");
        Student s1 = new Student("Emil", s1Passed);
        Student s2 = new Student("John", s1Passed);
        ArrayList<String> s2Passed = new ArrayList<>();
        s2Passed.add("Chemistry");
        s2Passed.add("Computer Science");
        Student s3 = new Student("Mary", s2Passed);
        Student s4 = new Student("Jane", s2Passed);

        ArrayList<String> tCanTeach = new ArrayList<>();
        tCanTeach.add("Chemistry");
        tCanTeach.add("Computer Science");
        tCanTeach.add("Java 1.0");
        Teacher t1 = new Teacher("Tess", tCanTeach);
        Teacher t2 = new Teacher("Jesper", tCanTeach);
        ArrayList<String> t1CanTeach = new ArrayList<>();
        t1CanTeach.add("Chemistry");
        t1CanTeach.add("Computer Science");
        Teacher t3 = new Teacher("Daniel", t1CanTeach);
        Teacher t4 = new Teacher("Tobias", t1CanTeach);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);
        persons.add(t4);

        // 3.7
        for (Person p : persons) {
            p.addCourse("Java 1.0");
            if (p instanceof Student) {
                if (!p.addCourse("Java 1.0")) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus");
                }
            } else if (p instanceof Teacher) {
                if (!p.addCourse("Java 1.0")) {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}