import java.util.*;

public class NumberNames{
	
	public static void main(String args[])
	{
		Scanner y=new Scanner(System.in);
		
		String number;
	
		System.out.println("Enter the Number:");
		
		number=y.nextLine();
		
		char[] s_to_a=number.toCharArray();
		
		String[] names= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		
		if (s_to_a[0]!='0')
			
		{
			for(char digit:s_to_a)
			{
				int index=Character.getNumericValue(digit);
				
				System.out.print(names[index]+" ");
				
			
			}
			
		}
		
		else
		{
			System.out.println("The number Should not start with Zero");
			
			System.out.println("Please Enter a Valid Number.....");
		}
		
		
	}
}


