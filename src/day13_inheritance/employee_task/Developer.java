package day13_inheritance.employee_task;

public class Developer extends Employee{

    private String programmingLanguage;


    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.trim().isEmpty()){
            System.err.println("Programming language cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }
}
