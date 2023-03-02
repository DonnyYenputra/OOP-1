import java.util.*;
public class Celsius{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double C, F;
        System.out.println("The changing temperature from Celsius to Fahrenheit");
        System.out.println("---------------------------------------------------");
        System.out.print("Input the degrees = ");
        C = sc.nextDouble();

        F = (C * 9/5) + 32;
        System.out.print("The Result of "+C+" degrees Celsius into Fahrenheit is "+F+" degrees");
    }
}
