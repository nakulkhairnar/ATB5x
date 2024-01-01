package Dec16_Class;

public class ATB027
{
    public static void main(String[] args) {
        //casting - mold
        // widening:- is process of converting lower to higher
        byte b = 10;
        int a = b; // implicit casting - JVM
        //int a = (int)b; int should be automatically consider by JVN no need to write

        //reverse function
        // narrowing:- is the process of coverting hight type to lower type
        int a1 = 300;
        //byte b1 = a1; due to overflow invalid implicit casting
        byte b1 = (byte)a1; //explicit casting will happen
        //it will store only byte part from the a1
        System.out.println(b1);
        // both of them consist implicit and explicit


    }
}
