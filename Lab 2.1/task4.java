import java.util.Scanner;
public class task4{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num [] = new int [20];
    
    for (int i = 0; i<num.length; i++){
      System.out.print("Enter Number:");
      num[i] = sc.nextInt();
    }
    
    System.out.println("Your Even Numbers in reverse order:");
    
    for (int i = num.length-1; i>=0; i--){
      
      if(num[i]%2==0){
        System.out.println(num[i]);
      }
      
    }
  }  
}