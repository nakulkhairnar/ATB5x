package Dec16_Class;

public class ATB041
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //part - A (Exp = 11, a = 11)-> ++a -> O/P --> 11
        //part - B (Exp = 11, a = 12)-> a++ -> O/P --> 11
        //part - C (Exp = 12, a = 13)-> a++ -> O/P --> 12
        //A+B+C --> 11 + 11 + 12 --> 34, a --> 13



    }
}
