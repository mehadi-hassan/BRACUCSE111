public class Student{
  
  public String name = "default name";
  public static int numberOfStudents = 0;
  
  public Student(){
    numberOfStudents++;
  }
  
  public Student(String nName){
    name = nName;
    numberOfStudents++;
  }
  
  public String getName(){
    return name;
  }
  
}