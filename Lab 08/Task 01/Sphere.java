public class Sphere extends Point{
  
  public Sphere (double r){
    super(r);
    System.out.println("Creating a Sphere … done!");
  }
  
  public double space(){
    return (4/3)*Math.PI*getRadius()*getRadius()*getRadius();
  }
}