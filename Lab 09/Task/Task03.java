import java.util.*;

public class Task03{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        double sum=0.0;
        double num;
        
        while(sc.hasNextDouble()){
            num = sc.nextDouble();
            if(num==0.0) break;
            else sum = sum + num;
        }
        
        System.out.println("Sum = "+sum);
    }
}
        





