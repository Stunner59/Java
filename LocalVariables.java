class LocalVariables 
{
	static int i;
	static double d = 20.98;
	public static void main(String[] args) 
	{
		int a = 20; //local variable doesn't have a default value
		
			System.out.println(i);
			System.out.println(a);
			System.out.println(d);
			demo(a);

	}

	public static void demo(int a)
	{
		System.out.println(a);
		System.out.println(d);
	}

}
