public class CheckingAccount extends Account{
  public static int numberOfAccount = 0;
  public double accountBlance = 0.0;
  
  public CheckingAccount(){    
    super(0.0);
    numberOfAccount++;
  }
  
  public CheckingAccount(double a){
    super(a);
    numberOfAccount++;
  }
}
