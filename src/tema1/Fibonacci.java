package tema1;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
	
		//afiseaza primele 10 elemente din Sirul Fibonacci incepand de la indexul 5
		try {
		fibonacciList(3,5);
		}
	    catch (Exception e)
        {
            e.printStackTrace();
        }
			
	}
	
	
    /**
     * Afiseaza primele x elemente din Sirul Fibonacci
     * @param numberOfElements - numarul de elemente maxim ce se doreste afisat
     * @param index - indexul de la care porneste afisarea
     */
	public static ArrayList<Integer> fibonacciList(int numberOfElements,int index)
	{
		int result = 0;
		int[] fibo = new int[100];
		
		fibo[0] = 1;
		fibo[1] = 1;
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(fibo[0]);
		myList.add(fibo[1]);
		
		for (int i=2;i<numberOfElements;i++)
		{
			
			fibo[i] = fibo[i-1] + fibo[i-2];
			result = fibo[i];
			myList.add(result);
			
		}
		
		List<Integer> luc = myList.subList(index-1, numberOfElements);
		
		System.out.println("Primele "+myList.size()+" elemente din Sirul Fibonacci: "+myList.toString());
		System.out.println("Elementele din Sirul Fibonacci incepand cu elementul "+index+": "+luc);
		return myList;

	}
	
}
