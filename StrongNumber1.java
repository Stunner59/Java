import java.util.Scanner;

class StrongNumber1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = s.nextInt();
		int str = n;
		int   sum = 0;
		s.close();
		
		while(n!=0){
			int fact=1;
			int rem = n%10;

			while(rem!=0){

				fact = fact*rem;
				--rem;
				
			}

//			for(int i = 1; i<=rem;i++)
//			{
//				fact = fact*i;
//			}

			sum = sum + fact;
			n /= 10;

		
		}

		if(str == sum)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");


	}
}
