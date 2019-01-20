public class Car{
  public static int count = 0;
  private int year = 0;
  public Car (int y){
    year = y;
    count++;
  }
  
  public int getYear(){
    return year;
  }
  
  public static int getObjectCount(){
    return count;
  }
}
    