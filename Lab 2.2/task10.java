import java.util.Scanner;
public class task10{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int numC[] = new int [10];
    int count = 0;
    int num;
    
    while (count!=2){
      
      num = sc.nextInt();
      
      if(num>=0 && num<=9){
        numC[num]++;
        
        if (numC[num]==2){
          count++;
        }
        else  if (numC[num]==4){
          count++;
        }
      }
      
      else{
        System.out.println("Enter Again");
      }
      
    }
    
    for (int i =0; i<numC.length; i++){
      if (numC[i]==2 || numC[i]==4){
        System.out.println(i);
      } 
    }
    
  }
}
