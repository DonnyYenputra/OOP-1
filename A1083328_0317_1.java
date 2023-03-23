import java.util.Scanner;
public class A1083328_0317_1{
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        int FirstNumber;
        int SecondNumber;
        System.out.print("Input First Number :" );
        FirstNumber= a.nextInt();
        while(FirstNumber<=0){
            System.out.print("Please input positif First Number :");
            FirstNumber= a.nextInt();
        }
        System.out.print("Input Second Number :");
        SecondNumber= a.nextInt();
        while(SecondNumber<=0){
            System.out.print("Please input positif Second number :");
            SecondNumber= a.nextInt();
        }
        int[][] b = new int[FirstNumber][SecondNumber];
        int[] d = new int[FirstNumber];
        for(int i=0;i<=FirstNumber-1;i++){
            d[i]=i+1;
        }
        int[] e = new int[SecondNumber];
        for(int j=0;j<=SecondNumber-1;j++){
            e[j]=j+1; 
        }
        for(int result:d){
            for(int hasil:e){
                b[result-1][hasil-1]=result*hasil;
            }
        }
        for(int f:d){
            for(int g:e){
                System.out.print(b[f-1][g-1]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}