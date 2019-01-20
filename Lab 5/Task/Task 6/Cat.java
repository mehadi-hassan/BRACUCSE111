public class Cat{ 
  public String color = "White"; 
  public String action = "sitting"; 
  
  public Cat(){
}
  
  public Cat (String newColor){
    color = newColor;
  }
  
  public  Cat (String newColor, String newAction){
    color = newColor;
    action = newAction;
  }
  
  public void printCat(){
    System.out.println(color+" cat is "+action);
  }
  
  public void changeColor(String newColor){
    color = newColor;
  }
}
