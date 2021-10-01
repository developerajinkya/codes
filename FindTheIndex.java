import java.util.*;
import java.lang.Math;
public class FindTheIndex
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    String str=sc.nextLine();
	    int max=0,temp=0,cnt=0;
	    for(int i=0;i<r;i++)
	    {
	        String s;
	        s=sc.nextLine();
	        temp=Integer.parseInt(s,2);
	        if(max<temp)
	        {
	            max=temp;
	            cnt=i+1;
	        }
	    }
	    System.out.println(cnt);
	}
}
