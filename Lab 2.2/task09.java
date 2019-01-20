import java.util.Scanner;
public class task09{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int num[] = new int[5];
    
    for (int i = 0; i<num.length; i++){
      num[i] = sc.nextInt();
      
    }
    
    int choice=0;
    
    while (choice!=1 && choice!=2 && choice!=3){
      System.out.printf("Enter Your Choice\n1.odd, 2. even, 3.all\n");
      choice = sc.nextInt();
    }
    
    if (choice == 1){
      
      for(int j = 0; j<num.length; j+=2){
        for(int k = 0; k<num.length; k+=2){
          if(num[j]>num[k]){
            int temp = num[j];
            num[j]=num[k];
            num[k]=temp;
          }
        }
      }
      
      for(int k = 0; k<num.length; k+=2){
        System.out.println(num[k]);
      }
      
    }
    
    if (choice == 2){
      
      for(int j = 1; j<num.length; j+=2){
        for(int k = 1; k<num.length; k+=2){
          if(num[j]>num[k]){
            int temp = num[j];
            num[j]=num[k];
            num[k]=temp;
          }
        }
      }
      
      for(int k = 1; k<num.length; k+=2){
        System.out.println(num[k]);
      }
      
    }
    
    if (choice == 3){
      
      for(int j = 0; j<num.length; j++){
        for(int k = 0; k<num.length; k++){
          if(num[j]>num[k]){
            int temp = num[j];
            num[j]=num[k];
            num[k]=temp;
          }
        }
      }
      
      for(int k = 0; k<num.length; k++){
        System.out.println(num[k]);
      }
      
    }
  }
}
