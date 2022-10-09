/*
Find the Largest binary gap
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
Example 1
Binary gap for 37:
binary for decimal 37 = 100101 
we have two binary gaps:
1001-> 2
101 -> 1
answer is the maximum of these two numbers
=2
Example 2
Binary gap for 4:
for decimal 4 = 100
since 1 occurs only a single time, we have no binary gaps.
so answer = 0

input: Any decimal within Range of(1,1000)
output: Largest Binary Gap
*/
import java.util.*;
class LargestBinaryGap {
    
    public static void main(String args[]) {
        // write your code in Java SE 8
      Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        
        String binary = Integer.toBinaryString(N);
	    int count=0;  //keep count of zeros
	    ArrayList<Integer> lengths = new ArrayList<Integer>();	//stores binary gaps
	    
	        for(int i = 0;i<binary.length();i++)
	{
	    if(binary.charAt(i)=='1' && (i+1) < binary.length() && binary.charAt(i+1)=='0' )    //search first encounter of 1 and only if subsequent charactor is 0 start counting the 0's
	    {
		    count +=1;
		    i++;
		    while(binary.length() > (i+1) && binary.charAt(i+1) == '0' ) //increment count if theres subsequent zeros
		    {			
			    count+=1;
			    i++;
			    if((i+1) < binary.length() && binary.charAt(i+1)=='1') //next index within range 
			    {
				    break;
			    }
		    }
		    if(binary.length() > (i+1) && binary.charAt(i+1)=='1') //add to lengths only if ending with 1
            {
			    lengths.add(count);
		        count =0;         //initializing count
            }
    	}
	}   
	if(lengths.size()==0)
	  {
	     System.out.print(0); 
	  }
	 else
	    System.out.print(Collections.max(lengths)); 
    }
}
