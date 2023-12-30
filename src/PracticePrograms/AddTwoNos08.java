package PracticePrograms;

import java.util.Scanner;

public class AddTwoNos08
{
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two integer to calculate there sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of entered integers = " +z);

    }
}
