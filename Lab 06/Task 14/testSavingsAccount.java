public class testSavingsAccount{
  public static void main (String[]args){
    
    SavingsAccount saver1 = new SavingsAccount(20000.00);
    SavingsAccount saver2 = new SavingsAccount(30000.00);
    SavingsAccount.annualInterestRate = 4.2/100;
    
    System.out.println("Saver 01 Monthly Interest: "+saver1.calculateMonthlyInterest());
    System.out.println("Saver 02 Monthly Interest: "+saver2.calculateMonthlyInterest());
    
    saver1.printSavingsBalance();
    saver2.printSavingsBalance();
    
    SavingsAccount.annualInterestRate = 5.5/100;
    
    System.out.println("Saver 01 New Monthly Interest: "+saver1.calculateMonthlyInterest());
    System.out.println("Saver 02 New Monthly Interest: "+saver2.calculateMonthlyInterest());
    
    saver1.printSavingsBalance();
    saver2.printSavingsBalance();
    
  }
}
    
    