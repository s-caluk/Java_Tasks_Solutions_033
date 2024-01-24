package day04_selection_statements;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 15;
        String gradeLevel = "";

        boolean validNumber = number >= 1 && number <= 18;

        if(validNumber){

            if (number >= 17) {
                gradeLevel = "Grad School";
            } else if (number >= 13) {
                gradeLevel = "College";
            } else if (number >= 9) {
                gradeLevel = "High School";
            } else if (number >= 6) {
                gradeLevel = "Middle School";
            } else if (number >= 1) {
                gradeLevel = "Elementary School";
            }

        } else {
            gradeLevel = "Invalid Grade Level";
        }
        System.out.println(gradeLevel);

        System.out.println("----------------------------------------");

        int sayi = 7;
        String result = "";

        switch (sayi) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Elementary School";
                break;
            case 6, 7, 8:
                result = "Middle School";
                break;
            default:
                result = "Invalid Grade Level";
        }
        System.out.println(result);

    }
}
/*
6. Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */