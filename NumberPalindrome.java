import java.util.*;
import java.util.Arrays;
public class Solution {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int dummy=num;
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		if(rev==dummy){
			System.out.println("true");
		} 
		else 
		{
			System.out.println("false");
		}
		
	}
}
