public class Fruit{
  
  private boolean formalin = false;
  public String name = "";
  
  public Fruit(boolean formalin, String name){
    this.formalin = formalin;
    this.name = name;    
  }    
  
  public String getName(){
    return name;
  }
  
  public boolean hasFormalin(){
    return formalin;
  }
  
  public String toString(){
    if(hasFormalin()){
      return name+"es are bad for you";
    }
    else{
      return name+"es are good for you";
    }
  }
}