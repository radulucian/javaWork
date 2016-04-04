package tema1;

public class Divizibilitate {

	public static void main(String[] args) {
		//returneaza elementele divizibile cu 3 si 5
		
		for (int i=1;i<100;i++)
		{
			
			if ((i%3 == 0) && (i%5 != 0))
			{

				System.out.print(" fiz ");
				
			}
			else if ((i%3 != 0) && (i%5 == 0))
			{
				
				System.out.print(" buz ");
				
			}
			else if ((i%5 == 0) && (i%3 == 0))
			{
				
				System.out.print(" fizbuz ");
				
			}
			else
			{
				
				System.out.print(i+" ");
				
			}
			
			
		}
	}
	


}
