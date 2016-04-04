package exercise4;
/**
 * 
 * @author aandrei
 *
 */
public class StringPresentation {
	
	public static void main(String[] args) {
		
		String x = "Java";
		x = x.concat(" Rules!");
		System.out.println("x = " + x); // the output is: x = Java Rules!
		
		x.toLowerCase(); // no assignment, create a new, abandoned String
		System.out.println("x = " + x); // no assignment, the output is still: x = Java Rules!
		
		x = x.toLowerCase(); // create a new String,
		// assigned to x
		System.out.println("x = " + x); // the assignment causes the  output: x = java rules!
		
		stringExercise();
		
		String ss = "big surprise";
		System.out.println(ss.toString());
		
		/**
		 * String common methods usage
		 */
		String charAtUsage = "airplane";
		System.out.println( charAtUsage.charAt(2) ); // output is 'r'
		
		String concatUsage = "taxi";
		System.out.println(concatUsage.concat(" cab")); // output is "taxi cab"
		
		//The overloaded + and += operators perform functions similar to the concat()
		String similarConcatUsage = "Atlantic";
		similarConcatUsage += " ocean";
		System.out.println(similarConcatUsage); // output is "Atlantic ocean"
		
		String equalsIgnoreCaseUsage = "Exit";
		System.out.println(equalsIgnoreCaseUsage.equalsIgnoreCase("EXIT")); // True
		System.out.println(equalsIgnoreCaseUsage.equalsIgnoreCase("tixe")); // False
		
		String lengthUsage = "01234567";
		System.out.println(lengthUsage.length()); // returns "8"
		
		String replaceUsage = "oxoxoxox";
		System.out.println( replaceUsage.replace('x', 'X') ); //oXoXoXoX
		
		String substringUsage = "0123456789";
		System.out.println(substringUsage.substring(5)); // output is "56789"
		System.out.println(substringUsage.substring(5, 8)); // output is "567"
																			
		String lowerUperCaseUsage = "A New Moon";
		System.out.println(lowerUperCaseUsage.toLowerCase()); // "a new moon"
		System.out.println(lowerUperCaseUsage.toUpperCase()); // "A NEW MOON"
		
		String trimUsage = " Hello ";
		System.out.println(trimUsage + "Java!" ); // result is " Hello Java!"
		System.out.println(trimUsage.trim() + "Java!"); // result is "HelloJava!"
		
		String string1 = "Hello";
		String string2 = "Hello";
		
		if(string1.equals(string2)){
			System.out.println("string1 equals string2");
		}else{
			System.out.println("string1 not equals string2");
		}
		
		/**
		 * StringBuilder common methods usage
		 */
		StringBuilder concatBuilderUsage = new StringBuilder();
		concatBuilderUsage.append("test").append(1).append(true);		
		System.out.println(concatBuilderUsage);
		
		StringBuilder deleteBuilderUsage = new StringBuilder("0123456789");
		System.out.println(deleteBuilderUsage.delete(4,6)); // output is "01236789"
		
		StringBuilder insertBuilderUsage = new StringBuilder("01234567");
		insertBuilderUsage.insert(4, "---");
		System.out.println(insertBuilderUsage); // output is "0123---4567"
		
		
		StringBuilder reverseBuilderUsage = new StringBuilder("A man a plan a canal Panama");
		reverseBuilderUsage.reverse();
		System.out.println(reverseBuilderUsage); // output: "amanaP lanac a nalp a nam A"
		
	}	
	
	private static void stringExercise(){
		String s1 = "spring ";
		String s2 = s1 + "summer ";
		s1.concat("fall ");
		s2.concat(s1);
		s1 += "winter ";
		System.out.println(s1 + " " + s2);
	}

}
