package PracticePrograms;

import java.util.Scanner;

public class GetInputFromUser04
{
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        s = in.nextLine(); //need to intialize the string value
        System.out.println("You entered string is" +s);

        System.out.println("Enter a integer");
        a = in.nextInt(); //need to intialize the integer value
        System.out.println("You entered string is" +a);

        System.out.println("Enter a float");
        b = in.nextFloat(); //need to intialize the value of float
        System.out.println("You entered string is" +b);
    }
}
