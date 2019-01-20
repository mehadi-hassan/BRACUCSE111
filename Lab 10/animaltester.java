public class animaltester{
  
  public static void main(String args[]) {
   
    Animal var1 = new Mammal();
    Object var2 = new Bird();
    Mammal var3 = new Tiger();
    Animal var4 = new Penguin();
    Bird var5 = new Eagle();
    Tiger var6 = new Animal();
    Object var7 = new Tiger();
    
    var1.move();
    var4.eat();
    var3.sound();
    var7.sound();
    var4.move();
    var2.fly();
    var1.sound();
    var3.move();
    var2.move();
    var5.move();
    var6.move();
    
    ((Tiger)var1).hunt();
    ((Animal)var2).sound();
    ((Eagle)var5).fly();
    ((Penguin)var5).fly();
    ((Penguin)var4).eat();
    ((Tiger)var3).hunt();
    ((Animal)var5).fly();
    ((Bird)var4).fly();
    ((Mammal)var7).move();
    
    
  }
}