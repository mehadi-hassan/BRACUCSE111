import java.util.Scanner;
public class Task11{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter Number of row:");
    int row = sc.nextInt();

    for(int i = 1; i<=row; i++){
      
      for(int j = 1; j<=(row-i); j++){
        System.out.print(" ");
      }
      
      for(int k = 1; k<=2*i-1; k++){
        if (i==1 || i==row || k==1 || k==2*i-1){
          System.out.print(k);
        }
        
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
  }
}