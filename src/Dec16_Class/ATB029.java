package Dec16_Class;

import java.sql.SQLOutput;

public class ATB029
{
    public static void main(String[] args) {
        // s1==s2? Reference are equal or not? - false
        //s1.equals(s2) ? Values are equal or not? - True
        String s1 = "Nakul";
        //string constant pool- SCP
        String s2 = new String("Nakul");
        //new operator is used to create the new object for the class
        //it returns of the address of newly created object
        System.out.println(s2);
        System.out.println(new String("Nakul"));

    }
}
