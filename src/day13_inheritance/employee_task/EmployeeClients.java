package day13_inheritance.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Alice", 30, "Female", "E123", "Tester", 90000, "Siemens" );
        tester.work();

        Developer developer = new Developer("Bob", 35, "Male", "E456", "Dev", 80000,"XYZ Inc", "Java");
        developer.work();

        Teacher teacher = new Teacher("Charlie", 40, "Male", "E789", "Teacher", 100000, "Education Center");
        teacher.work();

        Driver driver = new Driver("David", 45, "Male", "E012", "Driver", 50000, "Transport Services");
        driver.work();




    }
}
