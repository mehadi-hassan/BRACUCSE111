public class Violin extends Instrument{
    String name = "Violin";
    
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
