import java.util.*;
public class OddEven{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.println("Checking The ODD or EVEN Number");
        System.out.println("-------------------------------");
        System.out.print("Input the number = ");
        angka = sc.nextInt();

        if(angka%2==0){
            System.out.println("Number "+angka+" is Even");
        }else{
            System.out.println("Number "+angka+" is Odd");
        }
    }
}