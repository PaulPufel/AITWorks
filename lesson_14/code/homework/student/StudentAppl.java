package homework.student;

public class StudentAppl {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Frank", "Schmidt", 23, "electrician");
        Student student2 = new Student(2, "Olga", "Knol", 25, "nurse");
        Student student3 = new Student(3, "Peter", "Wagner", 19, "athlete");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(student1.getName());
        student1.study();

        System.out.println(student2.getName());
        student2.vacation();

        System.out.println(student3.getName());
        student3.exam();
    }
}

