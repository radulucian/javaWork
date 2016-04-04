/*
        Java Bubble Sort Example
        This Java bubble sort example shows how to sort an array of int using bubble
        sort algorithm. Bubble sort is the simplest sorting algorithm.
*/
 
public class BubbleSort {
 
        public static void main(String[] args) {
               
                //create an int array we want to sort using bubble sort algorithm
        		int[] intArray = { 5, 8, 14, 1, 5678 };
        		
        		
               
                //print array before sorting using bubble sort algorithm
                System.out.println("Array Before Bubble Sort");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
                }
               
                //sort an array using bubble sort algorithm
                bubbleSort(intArray);
               
                System.out.println("\n");
               
                //print array after sorting using bubble sort algorithm
                System.out.println("Array After Bubble Sort");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
                }
 
        }
 
        private static void bubbleSort(int[] intArray) {
                          
                int n = intArray.length;
                int temp;
               
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-1); j++){
                               
                                if(intArray[j-1] > intArray[i]){
                                        //swap the elements!
                                        temp = intArray[j-1];
                                        intArray[j-1] = intArray[i];
                                        intArray[i] = temp;
                                }
                               
                        }
                }
       
        }
}
 
