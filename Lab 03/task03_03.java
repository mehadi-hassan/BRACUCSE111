import java.util.Scanner;
public class task03_03{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    String s = sc.nextLine();
    
     for(int i = 0; i<s.length(); i++){
      char c = s.charAt(i);
      int codeC = s.codePointAt(i);
      System.out.println(c+" : "+codeC);
    }
     
  }
}