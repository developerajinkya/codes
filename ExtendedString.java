import java.util.*;
public class ExtendedString {
	static char encodedChar(String str,int k)
	{
		String expand = "";
		String temp = ""; 
		int freq = 0; 
		for (int i=0; i < str.length() ; )
		{
			temp = ""; 
			freq = 0; 
			while (i < str.length() && str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				temp += str.charAt(i);
				i++;
			}
     		while (i < str.length() && str.charAt(i)>='1'&& str.charAt(i)<='9')
			{
				freq = freq*10 + str.charAt(i) - '0';
				i++;
			}
			for (int j=1; j<=freq; j++)
				expand += temp;
		}
		if (freq==0)
			expand += temp;
		return expand.charAt(k-1);
	}
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		String str =  sc.nextLine();
		int k =sc.nextInt();
		System.out.println(encodedChar(str, k));
	}
}
