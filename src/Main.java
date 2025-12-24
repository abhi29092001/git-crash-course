public class Main {
    public static void main(String[] args) {
        Person person = new Person("Patrick", 34);
        Student student = new Student("John", 15, "stu12826");
        person.displayInfo();
        student.displayInfo();
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(person.getName());
    }
}
