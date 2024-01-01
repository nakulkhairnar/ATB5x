package Dec16_Class;

public class ATB030
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String s1 = "Nakul";
        String s2 = "Khairnar";
        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b)); //Due to BODMAS rule
    }
}
