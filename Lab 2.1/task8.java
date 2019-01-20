import java.util.Scanner;
public class task8{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num [] = new int [10];
    
    for (int i = 0; i<num.length; i++){
      System.out.print("Enter Number:");
      num[i] = sc.nextInt();
      
      for (int j = 0; j<i; j++){
        while (num[i]==num[j]){
          System.out.println("Duplicate Number. Enter Again");
          num[i] = sc.nextInt();
        }
      }
    }
  }
}