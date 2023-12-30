package Dec09_Class_CoreJava;

public class ATB002
{
    public static void main(String[] args) {
        byte age = 10; //range of the byte is -128 to 127
        age = 127; //if we take 128 then it will running out of range due to range validation
        System.out.println(age);// age is local verialble
        System.out.println(age+2); //this will execute becouse 
        short _age = 128; //range is -32768 to 32768
        System.out.println(_age);


    }
}
