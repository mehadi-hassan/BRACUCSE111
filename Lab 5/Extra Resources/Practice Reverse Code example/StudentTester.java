public class StudentTester{
  
  public static void main(String args[]){
 
    Student john = new Student();
    System.out.println(john);
    
    Student mike = new Student("Mike");
    System.out.println(mike);
    
    Student carol = new Student("Carol", "16123");
    System.out.println(carol);
    
    mike.setCGPA(3.5);
    mike.setID("32145");
    System.out.println(mike);
    
    john.setCGPA(3.8);
    john.setName("John");
    john.setAddress("Gulshan, Dhaka");
    System.out.println(john);
    
    System.out.println(carol.getName());
    System.out.println(carol.getCGPA());
    System.out.println(carol.getID());
  }
}