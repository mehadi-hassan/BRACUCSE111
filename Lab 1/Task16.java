import java.util.Scanner;
public class Task16{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter the row:");
    int row = sc.nextInt();
    
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    
    for (int i = 1; i<=row; i++){
      
      for (int j = 1; j<=num; j++){
        System.out.print("*");
      }
    
      System.out.println();
    
    }
  }
}
    