import java.util.*;
class Centuary 
{
 static void find_century(int year)
 {
	if (year <= 0)
	    System.out.print(0);
	else if (year <= 100)
		System.out.print(1);
	else if (year % 100 == 0)
		System.out.print(year / 100 );
	else
		System.out.print(year / 100 + 1);
 }
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
	int year =sc.nextInt();
	find_century(year);
 }
}
