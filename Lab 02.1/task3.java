import java.util.Scanner;
public class task3{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num [] = new int [10];
    
    for (int i = 0; i<num.length; i++){
      System.out.print("Enter Number:");
      num[i] = sc.nextInt();
    }
    
    System.out.println("Your Numbers in reverse order:");
    
    for (int i = num.length-1; i>=0; i--){
      System.out.println(num[i]);
    }
    
  }
}  