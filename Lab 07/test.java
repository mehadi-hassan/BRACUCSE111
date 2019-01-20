public class test{
  public static void main (String[]args){
    
    MyString s = new MyString("Hello World");
    
    System.out.println("Length: " + s.length());
    
    char  l = s.charAt(4);
    System.out.println("Charecter at 5: " + l);
    
    boolean check = s.startsWith("Bye World");
    System.out.println("Starts With: " + check);
    
    check = s.endsWith("Hello World");
    System.out.println("Ends With: " + check);
    
    s.replaceFirst("Hello", "Biday");
    s.replaceAll("Hello", "Hi");
    s.toLowerCase();
    s.toUpperCase();
    
    check = s.equals("Hello World");
    System.out.println("Matching new with previous: " + check);
    
    check = s.equalsIgnoreCase("HEllo WorLD");
    System.out.println("Matching new with previous ignore Case: " + check);
    
    System.out.println("Compare Between String: " + s.compareTo());
    
    System.out.println("Compare Between String Ignore Case: " +s.compareToIgnoreCase());
    
    System.out.println("Sub String: " + s.substring(2));
    
    System.out.println("Sub String Start End: " + s.substring(2,9));
    
    System.out.println("Index of e: " +s.indexOf('e'));
    
    System.out.println("Last Index of d: " +s.indexOf('d'));
    
    System.out.println("Index of d at 2: " +s.indexOf('d', 2));
    
    System.out.println("Last Index of W at 2: " +s.lastIndexOf('W', 2));
    
    System.out.println("Concat: " +s.concat(" from Other side"));
    
  }
}
