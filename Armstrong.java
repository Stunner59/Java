import java.util.Scanner;


class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		// System.out.println("Enter the number of digits: ");
		// int len = s.nextInt();

		System.out.println("Enter a Number to check: ");
		int n = s.nextInt();
		int str = n;
		int str1 = n;
		//len = String.valueOf(str).length();
		int   sum = 0, count=0;
		s.close();

		while(str1!=0){
			count++;
			str1/=10;
		}
		// System.out.println(count);
		
		while(n!=0){
			
			int rem = n%10;

			//int cube = rem*rem*rem;
			int pow = 1;
			for(int i = 1; i<=count; i++)
			{
				pow = pow * rem;
			}

			 sum = sum + pow;
			//  sum = sum + (Math.pow(rem,count));

			 n/=10;
		}			
		if(str == sum)
			System.out.println(str+ " is an ArmStrong Number");
		else
			System.out.println(str + " is Not a ArmStrong Number");


	}
}
