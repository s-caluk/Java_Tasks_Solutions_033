package day11_custom_class_part2;

//import day11_custom_class_part2.CydeoStudent;

public class CydeoStudentClients {

    public static void main(String[] args) {
        CydeoStudent.schoolName = "Cydeo";
        CydeoStudent.programmingLanguage = "Java";

        CydeoStudent student1 = new CydeoStudent("Semra", 45,202, 'A',1,3);
        CydeoStudent student2 = new CydeoStudent("Tuba", 35,203, 'B',1,3);
        CydeoStudent student3 = new CydeoStudent("Ayse", 25,204, 'C',1,3);

        System.out.println(student1); //CydeoStudent{name='Semra', age=45, id=202, grade=A, batchNumber=1, groupNumber=3}
        student2.study();             //Tuba is studying
        student3.attendClass();       //Ayse is attending the live class.
        CydeoStudent.printSchoolName();    //Cydeo
        CydeoStudent.printProgLanguage();  //Java
    }




}
