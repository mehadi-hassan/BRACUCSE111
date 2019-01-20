import java.util.Scanner;
public class task03_07{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    
    String s1 = "Hello World";
    String s2 = "Bye World";
    String s3;
    //7a
    int result = s1.compareTo(s2);
    System.out.println(result);
    
    //7b 
    result = s1.compareToIgnoreCase(s2);
    System.out.println(result);
    
    result = s2.compareToIgnoreCase(s1);
    System.out.println(result);
    
    //7c
    System.out.print("Return Value : ");
    System.out.println(s1.startsWith("Hello"));
    
    System.out.print("Return Value : ");
    System.out.println(s2.startsWith("Hello"));
    
    //7d
    boolean check = s1.endsWith("World");
    System.out.println("Return Value: "+check);
    
    check = s2.endsWith("Earth");
    System.out.println("Return Value: "+check);
    
    //7e
    check = s1.equals(s2);
    System.out.println("Return Value: "+check);
    
    //7f
    s1 = "Hello Everyone";
    s2 = "HEllo eVeryone";
    s3 = "Bye Everyone";
    check = s1.equalsIgnoreCase(s2);
    System.out.println("Return Value: "+check);
    check = s2.equalsIgnoreCase(s3);
    System.out.println("Return Value: "+check);
    
    //7g
    System.out.println("Index of");
    System.out.println(s1.indexOf('e'));
    
    //7h
    System.out.println("Last Index of");
    System.out.println(s1.lastIndexOf('n'));
    
    //7i
    int length = s1.length();
    System.out.println("Length is: "+length);
    
    //7j
    System.out.println("Replace "+s1.replace('o' , 'w'));
    
    //7k
    System.out.println("Substring: " + s1.substring(5));
    
    //7l
    String s0 = "new world";
    char[] a = s0.toCharArray();
    System.out.println("To Char Array: ");
    System.out.println("Length: "+a.length);
    System.out.println("Print at 4: "+a[4]);
    
    //7m
    System.out.println("Lower case: "+ s1.toLowerCase());
    
    //7n
    System.out.println("Upper case: "+ s2.toUpperCase());
    
    //7o
    String s4="    Hello Mars    ";
    System.out.println("Trim: "+s4.trim());
    
    //7p
    char[] s5 = {'h' , 'e', 'l', 'l', 'o'};
    String s6=" "; 
    s6 = s6.copyValueOf(s5);
    System.out.println("Copy value: "+s6);
    
  }
}