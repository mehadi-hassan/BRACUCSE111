import java.util.Scanner;
public class Task04{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter Number of row:");
    int row = sc.nextInt();

    for(int i = 1; i<=row; i++){
      
      for(int j = 1; j<=(row-i); j++){
        System.out.print(" ");
      }
      
      for(int k = (row-i+1); k<=row; k++){
        System.out.print(k);
      }
      
      System.out.println();
      
    }
    
  }
}