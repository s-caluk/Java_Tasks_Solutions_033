package day13_inheritance.employee_task;

    public class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            setName(name);
            setAge(age);
            setGender(gender);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                System.err.println("Name cannot be null, empty, or blank.");
                System.exit(1);
            }
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age <= 0) {
                System.err.println("Age must be greater than zero.");
                System.exit(1);
            }
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            if (gender == null || gender.trim().isEmpty()) {
                System.err.println("Gender cannot be null, empty, or blank.");
                System.exit(1);
            }
            this.gender = gender;
        }

        public void eat(){
            System.out.println(name + " is eating");
        }

        public void sleep(){
            System.out.println(name + " is sleeping");
        }
        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }

    }

