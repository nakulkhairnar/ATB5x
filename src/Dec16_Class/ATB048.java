package Dec16_Class;

import java.util.Scanner;

public class ATB048
{
    public static void main(String[] args) {
        //take three input from user and give max out of three numbers
        //a,b a>b--> a, else b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("Max" +a);

        }else{
            System.out.println("Max" +b);
        }
    }
}
