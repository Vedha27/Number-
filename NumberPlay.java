package assesmenttns;
import java.util.*;

public class NumberPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner y=new Scanner(System.in);
		int n, difference, dig1, dig2, reversedNumber;
		
		System.out.println("Enter Two Digits Number:");
		
		n=y.nextInt();
		
		if(n>9 && n<=99)
			
		{
			if(n<=50)
			{
				reversedNumber=(n%10)*10+(n/10);
				
				dig1=reversedNumber/10;
				
				dig2=reversedNumber%10;
				
				difference=dig1-dig2;
				
				System.out.println("Difference="+difference);
			}
			else
			{
				dig1=n/10;
				
				dig2=n%10;
				
				difference=dig1-dig2;
				
				System.out.println("Difference="+difference);
			}
		}
		else
			{
			System.out.println("Invalid number");
			}
		}

	}


