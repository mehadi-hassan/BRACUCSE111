import java.util.Scanner;
public class task06{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Enter the Value of n:");
    int n = sc.nextInt();
    
    int sum, sumE = 0, sumO = 0;
    
    for (int i = 1; i<=n; i++){
      
      if (i%2==0){
        sumE+=(i*i);
      }
      
      else {
        sumO+=(i*i);
      }
      
    }
    
    sum = sumO - sumE;
    
    System.out.println("Value of the eqn: "+sum);
    
  }
}