
public class Activity2 {

	public static void main(String[] args) {
	
		int[] numbers = {10, 77, 10, 54, -11, 10};
		int sum =0;
		int expectsum = 30;
		
	for (int i=0; i<numbers.length; i++)
	{
		if(numbers[i]==10) 
		{
			sum = sum+numbers[i];	
		}
				
	}	
	
	if (expectsum == sum)
	{
		System.out.println("Yes the value is " + sum);
	}
	else {
		System.out.println("No the value is not 30");
	}
		
	}
	
	}
		

