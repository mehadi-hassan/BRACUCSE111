public class Tester {
  public static void main(String args[]){
    Square sq = new Square();
    Circle cir = new Circle();
    Hexagon hex = new Hexagon();
    
    System.out.println(sq);
    System.out.println(cir);
    System.out.println(hex);
    
    sq.draw();
    cir.draw();
    hex.draw();
    
    System.out.println(sq.area() + " " + sq.number_sides());
    System.out.println(cir.area() + " " + cir.number_sides());
    System.out.println(hex.area() + " " + hex.number_sides());
  }
}