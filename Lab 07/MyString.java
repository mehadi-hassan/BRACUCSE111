public class MyString {
  
  char string_array[];
  int size;
  public String s;
  
  public MyString() {
  }
  
  public MyString(String new_string) {
    s = new_string;
  }
  
  public int length() {
    size = s.length();
    return size; 
  }
  
  public char charAt(int n){
    int c = n;
    return s.charAt(n);
  }
  
  public boolean startsWith(String substring){
    return this.s.startsWith(substring);
  }
  
  public boolean endsWith(String substring){
    return this.s.endsWith(substring);
  }
  
  public void replaceFirst(String oldChar, String newChar) {
    System.out.println("Replaced "+oldChar+" with "+newChar+" : "+s.replaceFirst(oldChar, newChar));
  }
  
  public void replaceAll(String oldChar, String newChar) {
    System.out.println("Replaced All "+oldChar+" with "+newChar+" : "+s.replaceAll(oldChar, newChar));
  }
  
  public void toLowerCase() {
    System.out.println("All Lower case: "+ this.s.toLowerCase());
  }
  
  public void toUpperCase() {
    System.out.println("All Upper case: "+ this.s.toUpperCase());
  }
  
  public boolean equals(String new_string){
    return this.s.equals(new_string);
  }
  
  public boolean equalsIgnoreCase(String new_string){
    return this.s.equalsIgnoreCase(new_string);
  }
  
  public int compareTo() {
    String w  = "Tata Hello Bye";
    return s.compareTo(w);
  }
  
  public int compareToIgnoreCase() {
    String w  = "hEllo WorLD";
    return s.compareToIgnoreCase(w);
  }
  
  public String substring(int start){
    return s.substring(start);
  }
  
  public String substring(int start, int end){
    return s.substring(start,end);
  }
  
  public int indexOf(char mychar) {
    return s.indexOf(mychar);
  }
  
  public int lastIndexOf(char mychar) {
    return s.lastIndexOf(mychar);
  }
  
  public int indexOf(char mychar, int n) {
    return s.indexOf(mychar, n);
  }
  
  public int lastIndexOf(char mychar, int n) { 
    return s.lastIndexOf(mychar, n);
  }
  
  
  public String concat(String new_string) {
    return s.concat(new_string);
  } 
}