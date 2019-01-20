public class Student {
  String name;
  String id;
  String address;
  double cgpa;
  
  // Empty constructor
  public Student() {
    name = "Default BRAC Student.";
    id = "00000";
    address = "BRAC University";
    cgpa = 2.0;
  }
  
  // Constructor that takes name.
  public Student(String myname){
    name = myname;
    id = "00000";
    address = "BRAC University";
    cgpa = 2.0;
  }
  
  // Constructor that takes name and id.
  public Student(String myname, String myid) {
    name = myname;
    id = myid;
    address = "BRAC University";
    cgpa = 2.0;
  }
  
  // Various get and set methods to change Name, ID, Address, CGPA. 
  public String getName(){
    return name;
  }
  
  public void setName(String n){
    name = n;
  }
  
  public String getID(){
    return id;
  }
  
  public void setID(String i){
    id = i;
  }
  
  public String getAddress(){
    return address;
  }
  
  public void setAddress(String a){
    address = a;
  }
  
  public double getCGPA(){
    return cgpa;
  }
  public void setCGPA(double c){
    cgpa = c;
  }
  
  
  // Overwrite the toString method to properly display 
  // the student information in a string format that
  public String toString() {
    return "Name: "+name+"\nID: "+id+"\nCGPA: "+cgpa+"\nAddress: "+address+"\n";
  }
}

  
  