public abstract class Shape {
  public abstract void draw();
  public abstract int number_sides();
  public abstract String area();
  
  public String toString() {
    System.out.println("We are in the Shape class");
  }
  
}