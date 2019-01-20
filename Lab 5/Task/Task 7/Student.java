public class Student{
  public String name = "Ei name e kono student nai";
  public String id = "Student ei nai, abar id :P";
  public String add = "Naam nai .. thikana ashbe koi theke?";
  public double cg = -4.0;
  
  public Student(){
  }
  public String nameDao(){
    return name;
  }
  
  public String boloToAmiKe(){
    return id;
  }
  
  public String addressDao(){
    return add;
  }
  
  public double cgpaDao(){
    return cg;
  }
  
  public void nameBoshao(String nName){
    name = nName;
  }
  
  public void addressBoshao(String nAdd){
    add = nAdd;
  }
  
  public void idBoshao(String nId){
    id = nId;
  }
  
  public void cgpaBoshao(double nCg){
    cg = nCg;
  }
  
  public Student (String nName, String nId, String nAdd, double nCg){
    name = nName;
    id = nId;
    add = nAdd;
    cg = nCg;
  }
  
  public void standUp(){
    System.out.println(name+" is now standing up!!");
  }
  
  public String tellMeYourName(){
    return "Sir, my name is "+name;
  }
  public void call(String nName){
    String sirName = nName;
    System.out.println(name+" : Hey, "+sirName+" Sir is calling you!!");
}
  public int add2Numbers(int num1, int num2){
    int sum = num1+num2;
    return sum;
  }
}
  
  
  
  
  