public class Keyboard extends Instrument{
    String name = "Keyboard";
    
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
