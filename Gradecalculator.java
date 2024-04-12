/*In this program you will know about if else conditions also try catch exception handling statements try on this and have a look on this you will understand */

import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerical grade value: ");
            int gradeNum = scanner.nextInt();
            String name = "NJ";
            char gradeValue;

            if (gradeNum >= 90 && gradeNum <= 100) {
                gradeValue = 'A';
                System.out.println(String.format("Hi %s, your grade is %s. Congratulations, %s!", name, gradeValue, name));
            } else if (gradeNum >= 80 && gradeNum <= 89) {
                gradeValue = 'B';
                System.out.println(String.format("Hi %s, your grade is %s. Congratulations, %s!", name, gradeValue, name));
            } else if (gradeNum >= 70 && gradeNum <= 79) {
                gradeValue = 'C';
                System.out.println(String.format("Hi %s, your grade is %s. Congratulation %s, keep it up!", name, gradeValue, name));
            } else if (gradeNum >= 60 && gradeNum <= 69) {
                gradeValue = 'D';
                System.out.println(String.format("Hi %s, your grade is %s. Work on it, you will get better, %s!", name, gradeValue, name));
            } else if (gradeNum >= 50 && gradeNum <= 59) {
                gradeValue = 'E';
                System.out.println(String.format("Hi %s, your grade is %s. You need to work on it, %s!", name, gradeValue, name));
            } else{
                System.out.print("Invalid grade. Please enter your grade in between 0 and 100.");
            }
        } catch(java.util.InputMismatchException exception){
            System.out.println("Invalid input: Please enter a numerical grade value, and you will get it");
        }finally{
            scanner.close();
        }
    }
}
