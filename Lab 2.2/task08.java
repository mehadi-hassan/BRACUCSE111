import java.util.Scanner;
public class task08{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
   
    int numC[] = new int[10];
    
    for (int i = 0; i<numC.length; i++){
      int temp = sc.nextInt();
      if (temp>=0 && temp<=9){
       
        numC[temp]++;
        
      }
      else{
       
        System.out.println("Enter Again");
       i--;
      }
    }
    for (int k = 0; k<numC.length; k++){
      if(numC[k]>=2 && numC[k]<5){
        System.out.println(k);
      }
    }
    
  }
}