import java.util.Scanner;
public class Task02{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter Number of Line:");
    int line = sc.nextInt();
    
    System.out.println("Enter how many numbers:");
    int num = sc.nextInt();
    
    for(int i = 1; i<=line; i++){
      
      for(int j = 1; j<num; j++){
        System.out.print(j);
      }
      
      System.out.println(num);
    }
  }
}