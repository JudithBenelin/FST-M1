package activities;

public class Activity2 {
	public static void main(String[] args) {
		int[] x = {10, 77, 10, 54, -11, 10};
		int b=0;
		
		for(int i= 0; i<=5; i++)
		{
			int a = x[i];
			
			
			if (a ==10) {
				 b=b+x[i];
			}
				
		}
		System.out.println("The sum of values 10 in the array is :" + b);
		if (b==30)
			System.out.println("True") ;
		else
			System.out.println("False");
			
	}
	
	
		
}
