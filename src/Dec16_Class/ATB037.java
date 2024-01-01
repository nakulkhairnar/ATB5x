package Dec16_Class;

public class ATB037
{
    public static void main(String[] args) {
        // A ternery operator
        // int a = condition ? if the is true print do this: if false print do this:
        //max in the two number
        // a = 10 , b=20;
        int a = 10;
        int b = 20;
        int max = a < b ? b : a;
        int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);

    }
}
