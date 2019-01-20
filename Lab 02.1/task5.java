import java.util.Scanner;
public class task5{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num [] = new int [10];
    
    for (int i = 0; i<num.length; i++){
      System.out.print("Enter Number:");
      num[i] = sc.nextInt();
    }
    
    System.out.print("Enter another Number:");
    int newNum = sc.nextInt();
    
    String check = "No";
    for (int j = 0; j<num.length; j++){
      
      if (num[j]==newNum){
        check = "Yes";
        break;
      }
      
    }
    
    System.out.println(check);
    
  } 
}   