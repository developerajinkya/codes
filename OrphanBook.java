import java.io.*;
import java.util.Scanner;
public class OrphanBook
{
	public static void main(String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int su=0;
	    int[]arr=new int[100];
	    for(int i=0;i<n;i++)
	    {
	         arr[i]=sc.nextInt();
	         su=su+arr[i];
	    }
	    int re=0;
	    if(su%n==0)
	    {
	        int t=su/n;
	        for(int i=0;i<n;i++)
	        {
	            while(arr[i]<t)
	            { 
	                arr[i]=arr[i]+1;
	                re=re+1;
	            }
	        }
	        System.out.print(re);
	    }
	    else
	        System.out.print(-1);
	}
	        
}	    
	    
	 
