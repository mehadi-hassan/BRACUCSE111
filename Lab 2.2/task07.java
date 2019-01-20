import java.util.Scanner;
public class task07{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int [] a=new int[11];

  for(int i=0; i<=a.length-1; i++){
    int temp=sc.nextInt();
    int count=1;
    for(int j=0;j<=i-1;j++){
      if(a[j]==temp){
        count++;
      }
    }
      
     if(count>4){
        i--;
        System.out.println("Enter the number again");
       
     } else {
       a[i]=temp;
     }
    
  }
  }
}
