import java.util.*;

public class Student implements StInterface{
    
    public String name;
    public int id;
    public String address;
    
    public static Comparator<Student> NAME_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(final Student o1, final Student o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    
    public void setName(String n){
        name = n;
    }
    public void setID(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public void setAddress(String add){
        address = add;
    }
    public String getAddress(){
        return address;
    }
    
    public String toString(){
        return name+"\n"+id+"\n"+address;
    }
    
}
