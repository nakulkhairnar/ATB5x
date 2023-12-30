package Dec23_Class;

import java.util.Scanner;

public class ATB069
{
    public static void main(String[] args) {
        // take the input and print the information
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = user_input.next();

        System.out.println("Enter your Age");
        int age = user_input.nextInt();

        System.out.println("Enter your Salary");
        double salary = user_input.nextDouble();
        System.out.println("Your details are" + name + "-"+ age + "-"+ salary);
        user_input.close();
    }

}

