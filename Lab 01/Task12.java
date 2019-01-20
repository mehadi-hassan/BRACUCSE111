import java.util.Scanner;
public class Task12{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter Number of row:");
    int row = sc.nextInt();

    for(int i = 1; i<=row; i++){
      
      for(int k = 1; k<=(row-i); k++){
        System.out.print(" ");
      }
      
      for(int j = 1; j<=2*i-1; j++){
        if (i==1 || j==1 || j==2*i-1){
          System.out.print(j);
        }
        
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
    for (int i = row - 1; i>=1; i--){
      
      for(int k = 1; k<=(row-i); k++){
        System.out.print(" ");
      }
      
      for(int j = 1; j<=2*i-1; j++){
        if (i==1 || j==1 || j==2*i-1){
          System.out.print(j);
        }
        
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
  }
}