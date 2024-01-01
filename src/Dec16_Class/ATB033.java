package Dec16_Class;

public class ATB033
{
    public static void main(String[] args) {
        String name = "nakul ashok khairnar";
        String name1 = "nakul ashok khairnar";
        String name2 = new String("nakul ashok khairnar"); //heap area
        System.out.println(name == name1);
        System.out.println(name.equals(name1));

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));//if if name is same but case if diff

    }
}
