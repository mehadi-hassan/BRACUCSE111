public class Guitar extends Instrument{
  
  String name = "Guitar";
  
  public void play(){
    System.out.println("Playing "+name);
  }
  public void adjust(){
    System.out.println("Adjusting "+name);
  }
  public void compose(){
    System.out.println("Composing"+name);
  }
}
