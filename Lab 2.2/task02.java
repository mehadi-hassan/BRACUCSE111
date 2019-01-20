import java.util.Scanner;
public class task02{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int [] num = new int [10];
    
    for (int i = 0; i<num.length; i++){
      
      System.out.println("Enter a number:");
      num[i] = sc.nextInt();
      
      System.out.print("You have entered ");
      
      for(int j = 0; j<=i; j++){
        
        if(j==0){
          System.out.print(num[j]);
        }
        
        else{
          System.out.print(", "+num[j]);
        }
        
      }
      System.out.println();
    }
  }
}