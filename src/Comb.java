public class Comb{
  
  public Comb(){
  
    String str_arr[]={"a","b","c"};
    GenCombinations(str_arr);
  }
  
  
  /**
    THE METHOD THAT TAKES AN ARRAY OF STRINGS AND PRINTS THE 
    POSSIBLE COMBINATIONS.
  */
  public void GenCombinations(String[] str_arr){
  
   
    /*COMBINATIONS OF LENGTH THREE*/
    for(int i=0;i<str_arr.length;i++)
     {
      for(int j=0;j<str_arr.length;j++)
       {
        for(int k=0;k<str_arr.length;k++)
         {  
            System.out.println(str_arr[i]+""+str_arr[j]+""+str_arr[k]);  
            String x = str_arr[i];
            String y = str_arr[j];
            String z = str_arr[k];
         }
       }
     }
  } 
  
  
  public static void main(String[] args){
  
    new Comb();
  }
}