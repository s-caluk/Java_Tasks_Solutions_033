package day11_custom_class_part2;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee emp1 = new Employee("James", 30, 'M', "Software Engineer", 70000.0);
        Employee emp2 = new Employee("Yulia", 25, 'F', "Data Analyst", 60000.0);

        emp1.work();              //Software Engineer James is working.
        emp2.work();

        System.out.println(emp1); //Employee{name='James', age=30, gender=M, jobTitle='Software Engineer', salary=70000.0}


    }
}
