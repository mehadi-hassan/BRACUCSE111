import java.util.Scanner;
public class Task08{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("How Many rows:");
    int row = sc.nextInt();
    
    System.out.println("Enter Number:");
    int num = sc.nextInt();
    
    for (int i = 1; i<=row; i++){
      
      for (int j = 1; j<=num; j++){
        
        if (i==1 || i==row || j==1 || j==num){
          System.out.print(j);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
      
    }
  }
}  
