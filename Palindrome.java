import java.util.Scanner;

class Palindrome
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
			
			int rem = n%10;
			sum = (sum*10)+rem;
			 n/=10;
		}			
		if(str == sum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
		}
}
