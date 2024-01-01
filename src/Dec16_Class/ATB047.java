package Dec16_Class;

import java.util.Scanner;

public class ATB047
{
    public static void main(String[] args) {

        //take an input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if(a%2 == 1){
            System.out.println("Odd number");
        }else {
            System.out.println("Even number");
        }
    }
}
