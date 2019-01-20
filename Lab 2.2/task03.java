import java.util.Scanner;
public class task03{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int [] num = new int [10];
    
    for (int i = 0; i<num.length; i++){
      
      System.out.println("Enter a number:");
      num[i] = sc.nextInt();
      
      for (int j = 0; j<=i; j++)
        
        if(num[i]>num[j]){
        
        int temp = num[i];
        num[i]=num[j];
        num[j]=temp;
        
      }
      
    }
    
    System.out.println("Numbers Sorted in Descending Order:");
    
    for (int k = 0; k<num.length-1; k++){
      System.out.print(num[k]+", ");
    }
    
    System.out.println(num[num.length-1]);
    
  }
}