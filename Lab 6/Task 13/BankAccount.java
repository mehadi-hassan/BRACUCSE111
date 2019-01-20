public class BankAccount{
  
  public String name;
  public String accountID;
  public String address;
  public double balance;
  public double interest;
  
  public void setName(String n){
    name = n;
  }
  
  public void setAccountID (String i){
    accountID = i;
  }
  
  public void setAddress(String a){
    address = a;
  }
  
  public void setBalance(double c){
    balance = c;
  }
  
  public String getName(){
    return name;
  }
  
  public String getAccountID(){
    return accountID;
  }
  
  public String getAddress(){
    return address;
  }
  
  public double getBalance(){
    return balance;
  }
  
  public double addInterest(){
    return (balance*.07);
  }
}
  
  