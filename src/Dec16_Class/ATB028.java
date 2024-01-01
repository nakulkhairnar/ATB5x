package Dec16_Class;

public class ATB028
{
    public static void main(String[] args) {
        int cource = 100;
        float gst = 0.1845f;
        int total = cource+ (int)gst*cource; // in this case we lost a data
        System.out.println(total);
        float total1 = cource+gst*cource;
        System.out.println(total1);

        //reverse example
        float course = 100.455f;
        float GST = 18.45f;
        double TOTAL = course + GST; //imp - user always big container to store a value
        System.out.println(TOTAL);

    }
}
