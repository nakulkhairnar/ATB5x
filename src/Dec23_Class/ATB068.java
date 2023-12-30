package Dec23_Class;

import java.util.Scanner;
public class ATB068
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X");
        double x = sc.nextDouble();
        System.out.println("Enter the Y");
        double y = sc.nextDouble();
        System.out.println("Enter the Z");
        double z = sc.nextDouble();
        double result;
        // 3/x^2 + y^2 - |Z|
        // A+B-C --> A -> X^2, B-> Y^2, C->|Z| abs(Z) |-1|->1
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2)- Math.abs(z));
        System.out.println(result);
        //scanner stream should be closed after we are done.
        sc.close();
    }



}
