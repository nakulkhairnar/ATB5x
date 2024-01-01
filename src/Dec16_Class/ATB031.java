package Dec16_Class;

public class ATB031
{
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // valid implicit casting
        int a1 = (int)b; //valid - explicit casting
        //IMP- In narrowing implicit casting is not possible
    }
}
