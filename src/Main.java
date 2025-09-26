import Class.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.showInfo();

        student1.setName("Carlos");
        student1.setAge(19);
        student1.setId("A1001");
        student1.showInfo();

        Student student2 = new Student("Alice", 20);
        student2.showInfo();

        Student student3 = new Student("Bob", 22, "S12345");
        student3.showInfo();

        System.out.println("Student3 Name: " + student3.getName());
        System.out.println("Student3 Age: " + student3.getAge());
        System.out.println("Student3 ID: " + student3.getId());
    }
}
