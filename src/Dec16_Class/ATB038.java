package Dec16_Class;

public class ATB038
{
    public static void main(String[] args) {
        //max in the three numbers
        int a = 10;
        int b = 20;
        int c = 12;

        int max = (a>b) ? ((a > c ) ? a : c) : ((b > c) ? b:c);
        System.out.println(max);
        //here the logic is works like this: if (a>b) this condition true then a will compair
        // with c and if (a>c) then it will a else c
        // if (a>b) this condition false it means b is greater than a then (b>c) this
        // condition will compair if (b>c) is true then it will print b else c will print

    }
}
