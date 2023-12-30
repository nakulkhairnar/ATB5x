package PracticePrograms;

import java.util.Scanner;

public class IfElse11
{
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks = 40; //define the value of the initiazation
        Scanner sc = new Scanner(System.in);
        System.out.println("input marks scored by you");
        marksObtained = sc.nextInt(); // set the input initialization

        if (marksObtained >= passingMarks)
        {
            System.out.println("You passed the exam");
        }
        else {
            System.out.println("Unfortunetly you failed to pass the exam");
        }
    }
}
