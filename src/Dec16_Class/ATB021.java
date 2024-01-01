package Dec16_Class;

public class ATB021
{
    public static void main(String[] args) {
        // A compound operators
        System.out.println(10 == 10);
        System.out.println(10 >= 10);
        System.out.println(10 <= 10);
        System.out.println(10 < 10);
        System.out.println(10 > 10);

        System.out.println("--------");
        System.out.println('A'== 65); //ASCII
        System.out.println('A'== 55);

        byte b = 65;
        System.out.println('A' == b);
        System.out.println('A' == 65.0f); //this is property of JAVA: is comparing like int
        System.out.println('A' == 65.2); // it is a double so it is not compare
       // System.out.println(true == 0); this is not possible between two boolean there is not comparison


    }
}
