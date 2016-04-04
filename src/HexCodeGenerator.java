import java.io.*;
import java.lang.*;
 
public class HexCodeGenerator
{
    public static void main(String args[])
    {
    	for (int index = 0; index < 10; index++) {
    		System.out.println(gencode());
    	}
        
    }
     
    static String gencode()
    {
        String[] letters = new String[15];
        letters = "0123456789ABCDEF".split("");
        String code ="";
        for(int i=0;i<6;i++)
        {
            double ind = Math.random() * 15;
            int index = (int)Math.round(ind);
            code += letters[index]; 
        }
        return code;
    }
}