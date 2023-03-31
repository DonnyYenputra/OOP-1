import java.util.*;

class Animals{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("Name\theight\tweight\tspeed");
        System.out.println(name+"\t"+height+"\t"+weight+"\t"+speed);
    }

    double distance(double x, double y){
        return x*y*speed;
    }

    double distance(double x){
        return x*speed;
    }
}


public class A1083328_0324_1 {
    public static void main(String [] args){
      Animals animals1, animals2, animals3, animals4;

      animals1= new Animals();
      animals2= new Animals();
      animals3= new Animals();
      animals4= new Animals();

      animals1.name="Monkey";
      animals1.height=1.1;
      animals1.weight=52;
      animals1.speed=100;
      animals1.show(); 
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the time : ");
      double x = sc.nextDouble();
      System.out.print("Enter the acceleration : ");
      double y = sc.nextDouble();
      System.out.println("The Monkey distance: "+animals1.distance(x, y));
      System.out.println();

      animals2.name="Donkey";
      animals2.height=1.5;
      animals2.weight=99;
      animals2.speed=200;
      animals2.show(); 
      System.out.print("Enter the time : ");
      double a = sc.nextDouble();
      System.out.print("Enter the acceleration : ");
      double b = sc.nextDouble();
      System.out.println("The Donkey distance: "+animals2.distance(a, b));
      System.out.println();

      animals3.name="Aina";
      animals3.height=1.7;
      animals3.weight=48;
      animals3.speed=120;
      animals3.show(); 
      System.out.print("Enter the time : ");
      double c = sc.nextDouble();
      System.out.print("Enter the acceleration : ");
      double d = sc.nextDouble();
      System.out.println("The Donkey distance: "+animals3.distance(c, d));
      System.out.println();

      animals4.name="Aisha";
      animals4.height=1.7;
      animals4.weight=50;
      animals4.speed=120;
      animals4.show(); 
      System.out.print("Enter the time : ");
      double e = sc.nextDouble();
      System.out.print("Enter the acceleration : ");
      double f = sc.nextDouble();
      System.out.println("The Donkey distance: "+animals4.distance(e, f));
      System.out.println();

    }

}