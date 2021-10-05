class Lighter{
	public static void light(int width)
	{
		if(width>0)
		{
			System.out.println("true");
			return;
		}
			System.out.println("false");
			return;
	}
		public static boolean On()
	{	
		System.out.println("invoked on");
		return true;
	}
	public static boolean off()
	{
		System.out.println("invoked off");
		return false;
	}
		public static int currentWidth(){
		System.out.println("invoked currentWidth");
		int width=3;
		System.out.println(width);
		System.out.println(width);
		return width;
	}
}
	