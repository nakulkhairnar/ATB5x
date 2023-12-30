package PracticePrograms;

import java.util.Scanner;

public class NastedIfElse12
{
    public static void main(String[] args)
    {
        int marksObtained, passingMarks;
        char grade;
        passingMarks = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks scored by You");
        marksObtained = sc.nextInt();
        //main if loof dosent consist ; which consist {}
        if (marksObtained >= passingMarks)
        {
            if (marksObtained > 90)
            grade = 'A';
            else if (marksObtained > 75)
                grade = 'B';
            else if (marksObtained > 65)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("You passed the Exam and your Grade is" +grade);
        }
        else
        {
            grade = 'F';
            System.out.println("You failed and your grade is" +grade);
        }
    }

}
