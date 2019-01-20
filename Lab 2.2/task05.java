import java.util.Scanner;
public class task05{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Enter Voltage:");
    double E = sc.nextDouble();
    
    System.out.print("Enter Resistance:");
    double R = sc.nextDouble();
    
    System.out.print("Enter Inductance:");
    double L = sc.nextDouble();
    
    System.out.print("Enter Capacitance:");
    double C = sc.nextDouble();
    
    System.out.print("Enter Frequency:");
    double f = sc.nextDouble();
    
    double I = E/(Math.sqrt((R*R)+Math.pow((2*3.14*f*L-(1/2*3.14*f*C)),2)));
    
    System.out.printf("Current = %.3f\n",I);
    
  }
}