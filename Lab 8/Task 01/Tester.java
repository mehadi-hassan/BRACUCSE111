import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter radius of Circle:");
    double r = sc.nextInt();
    Circle c = new Circle (r);
    System.out.println("the area of the circle is " + c.space());
    System.out.print("Enter radius of Sphere:");
    double x = sc.nextInt();
    Sphere y = new Sphere (x);
    System.out.println("the area of the circle is " + y.space());
  }
  
}