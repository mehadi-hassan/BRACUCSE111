public class Test{
  public static int [] removeOdd (int [] mixedArray){
    int count = 0;
    
    for (int i = 0; i<mixedArray.length; i++){
      if(mixedArray[i]%2!=0){
        count++;
      }
    }
    
    int [] noOdd =new int [mixedArray.length-count];
    
    int evenCount = 0;
    
    for(int i = 0; i<mixedArray.length; i++){
       if(mixedArray[i]%2==0){
        noOdd[evenCount] =  mixedArray[i];
         evenCount++; 
         
      }
    }
    return noOdd;

  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}

