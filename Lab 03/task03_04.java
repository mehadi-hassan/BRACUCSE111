import java.util.Scanner;
public class task03_04{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    String s = sc.nextLine();
    int count[] = new int [91];
    
     for(int i = 0; i<s.length(); i++){
       count[s.codePointAt(i)]++;
     }
       
       for(int j = 65; j<=90; j++){
         System.out.println((char)j+" which is "+ j +" was found "+count[j] +" times");
       }
       
  }
}