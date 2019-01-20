public class BBAStudent extends Student{
  public BBAStudent(){
    setName("Default BBA Student");
    setDepartment("BBA");
  }
  
  public BBAStudent(String n){
    String name = n;
    setName(name);
    setDepartment("BBA");
  }
}