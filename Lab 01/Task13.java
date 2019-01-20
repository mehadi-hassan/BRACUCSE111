import java.util.Scanner;
public class Task13{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    
    for(int i = 1; i<=num; i++){
      System.out.print(i);
    }
    
    for (int j = num-1; j>=1; j--){
      System.out.print(j);
    }
    
    System.out.println();
    
  }
}