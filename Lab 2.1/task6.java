import java.util.Scanner;
public class task6{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num[] = new int [15];
    int numC[] = new int [10];
    
    for(int i = 0; i<num.length; i++){
      
      System.out.println("Enter a number between 0-9:");
      num[i] = sc.nextInt();
      
      for (int j = 0; j<numC.length; j++){
        
        if (num[i]==j){
          numC[j]++;
        }
        
      }
      
    }
    
    for (int k = 0; k<numC.length; k++){
      if(numC[k]!=0){
        System.out.println(k+" has been entered "+numC[k]+" times");
      }
      
    }
  }
}