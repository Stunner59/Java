import java.util.Scanner;

class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		int r = s.nextInt();
		s.close();
		
		System.out.println("The Area of Circle is = "+ area(r));
		
	}

     public static float area(int r)
	{
		 return 3.14f*(r*r);
	}


}
