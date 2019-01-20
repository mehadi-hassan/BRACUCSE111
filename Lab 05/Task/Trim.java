public class Trim{
  public static char [] trim(char [] input){
     
    int space = 0;
    
    for (int i = 0; i<input.length-1; i++){
      if(input[i]==' ' && input[i+1]==' '){
        space++;
      }
    }
    
    char [] output = new char [input.length-space];
    int k = 0;
    
    for(int i = 0; i<input.length-1; i++){
      if(!(input[i]==' ' && input[i+1]==' ')){
        output[k] = input[i];
        k++;
      }
    }
    
    output[k] = input[input.length-1];
    return output;
  }
  
  public static void main(String [] args){
    
    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
    
    for (int i = 0; i< input.length; i++){
      System.out.print(input[i]);
    }
    
    System.out.println("");
    
    char []  output = trim(input);
    
    for (int i = 0; i< output.length; i++){
      System.out.print(output[i]);
    }
    
    System.out.println("");    
  }
}
