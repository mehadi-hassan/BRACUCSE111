public class AccountTester {
  public static void main (String[]args){
    
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount();
    BankAccount acc3 = new BankAccount();
    
    acc1.setName("Hridoy");
    acc1.setAccountID("1712192");
    acc1.setAddress("66 Mohakhali");
    acc1.setBalance(5500);
    
    System.out.println("Account Name: " + acc1.getName());
    System.out.println("Address: " + acc1.getAddress());
    System.out.println("Account ID: " + acc1.getAccountID());
    System.out.println("Balance: " + acc1.getBalance());
    System.out.printf("Interst Amount: %.2f\n\n",acc1.addInterest());
    
    acc2.setName("Tushar");
    acc2.setAccountID("1712193");
    acc2.setAddress("29 Puran Dhaka");
    acc2.setBalance(3000);
    
    System.out.println("Account Name: " + acc2.getName());
    System.out.println("Address: " + acc2.getAddress());
    System.out.println("Account ID: " + acc2.getAccountID());
    System.out.println("Balance: " + acc2.getBalance());
    System.out.printf("Interst Amount: %.2f\n\n",acc2.addInterest());
    
    acc3.setName("Istear");
    acc3.setAccountID("1712194");
    acc3.setAddress("89 Uttara");
    acc3.setBalance(9373);
    
    System.out.println("Account Name: " + acc3.getName());
    System.out.println("Address: " + acc3.getAddress());
    System.out.println("Account ID: " + acc3.getAccountID());
    System.out.println("Balance: " + acc3.getBalance());
    System.out.printf("Interst Amount: %.2f\n",acc3.addInterest());
    
    
  }
}