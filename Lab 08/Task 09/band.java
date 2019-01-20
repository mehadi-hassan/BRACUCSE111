public class band{
  public static void main(String[]args){
    
    Guitar G = new Guitar();
    Keyboard K = new Keyboard();
    Violin V = new Violin();
    
    G.play();
    G.adjust();
    G.compose();
    K.play();
    K.adjust();
    K.compose();
    V.play();
    V.adjust();
    V.compose();    
  }
}
