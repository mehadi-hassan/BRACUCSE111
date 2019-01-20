import java.util.*;


public class test10{
    public static void main(String[]args){
        
        Scanner name = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        Scanner address = new Scanner(System.in);
        
        Student [] s = new Student[4];
        
        for(int i=0; i<4; i++){
            s[i] = new Student();
            
            System.out.println("Enter The Name Of A Student:");
            s[i].name = name.nextLine();
            System.out.println("Enter The Id Of A Student:");
            s[i].id = id.nextInt();
            System.out.println("Enter The Address Of A Student:");
            s[i].address = address.nextLine();
        }
        
        Arrays.sort(s, Student.NAME_COMPARATOR);
        System.out.println(Arrays.toString(s));
        
        
    }
}

