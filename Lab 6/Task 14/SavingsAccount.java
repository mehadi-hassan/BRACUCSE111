public class SavingsAccount{
  
  public static double annualInterestRate;
  public double savingsBalance;
  public double interest;
  public double nBalance;
  
  public SavingsAccount (double d){
    savingsBalance = d;
    nBalance = d;
  }
  
  public double calculateMonthlyInterest(){
    interest = (savingsBalance*annualInterestRate)/12;
    return interest;
  }
  
  public static void modifyInterestRate(double d){
    annualInterestRate = d;
  }
  
  public double newBalance(){
    nBalance = nBalance+interest;
    return nBalance;
  }
  
  public void printSavingsBalance(){
    System.out.println(newBalance());
  }
  
}