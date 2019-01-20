import java.util.Scanner;
public class task03_06{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    String s = sc.nextLine();
    String d = "==THE END==";
    String e = s.concat(d);
    
    System.out.println(s);
    System.out.println(e);
    System.out.println(s);
    
  }
}