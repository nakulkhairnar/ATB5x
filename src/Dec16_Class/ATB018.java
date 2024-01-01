package Dec16_Class;


public class ATB018
{
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        // simple assignment operators
        System.out.println(a+b);
        String name = "Nakul";
        System.out.println(a+name);
        System.out.println(name+a);
        // calculation always happen from left to right
        //concatination - String + other
        System.out.println(a+b+name);
        //all the + below are concatinated
        System.out.println(name+a+b);
    }
}
