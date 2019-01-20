import java.util.Scanner;
public class task9{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num [] = new int [10];
    
    for (int i = 0; i<num.length; i++){
      System.out.print("Enter Number:");
      num[i] = sc.nextInt();
    }
    
    for (int i = 0; i<num.length; i++){
      
      if(num[i]%2!=0){
        System.out.print(num[i]+", ");
      }
      
    }
    
    System.out.println("Numbers entered so far:");
    
    for (int j = 0; j<num.length-1; j++){
      
      if(num[j]%2==0){
        System.out.print(num[j]+", ");
      }
    }
    
    System.out.println(num[num.length-1]);
    
  }
}