import java.util.*;

public class Task04{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numbers with space in between");
        String num = sc.nextLine();
        
        String [] result = num.split("\\s");
        
        double sum = 0;
        
        for (int x=0; x<result.length; x++) {
            String num2 = result[x];
            double sNumber = Double.parseDouble(num2);
            sum = sum + sNumber;
        }
        
        System.out.println("Sum = "+sum);
    }
}

    
    
    
