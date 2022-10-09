/* Given a string, compress it by following rules
1.If a same character multiple times consecutively then store it as character value followed by count of consecutive occurance.
2.If a character does not occur consecutively then just store the character.
Example: 
Input: AAAAABCCCCAAAKBCC
Output: A5B2C4A3KBC2

*/
import java.util.*;
public class CompressAString
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	   for(int i=0;i<s.length();i++)
	   {
	       int count=1;
	       while(i+1<s.length() && s.charAt(i)== s.charAt(i+1))
	       {
	           i++;
	           count++;
	       }
	       if(count==1)
	       {
	           System.out.print(s.charAt(i));
	       }
	       else
	       {
	          System.out.print(s.charAt(i)+""+count);
	       }
	   }
	}
}
