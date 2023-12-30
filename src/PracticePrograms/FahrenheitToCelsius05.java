package PracticePrograms;
import java.util.*;
public class FahrenheitToCelsius05
{
    public static void main(String[] args) {
        float temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temprature in fahrenheit");
        temp = in.nextInt();
        temp = ((temp - 32)*5)/9;
        System.out.println("Temprature in the celsius=" +temp);
    }
}
