import java.util.Scanner;
public class task01{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int [] num = new int [10];
    
    for (int i = 0; i<num.length; i++){
      
      System.out.println("Enter a number:");
      num[i] = sc.nextInt();
      
    }
    
    System.out.println("Your Numbers in Reverse Order:");
    
    for (int j = num.length-1; j>=1; j--){
      
      System.out.print(num[j]+", ");
      
    }
    
    System.out.println(num[0]);
    
  }
}