import java.util.Scanner;

class Strong
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = s.nextInt();
		int rem = 0, res=1, sum = 0;
		s.close();
		
		while(n!=0){

			rem = n%10;

			while(rem!=0){

				res = res*rem;
				rem--;
				sum = sum + res;
			}
			n = n/10;

		
		}

		if(sum == n)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");


	}
}
