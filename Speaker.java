class Speaker
{
	public static void volume(int level)
	{
		if(level<=0)
		{
			System.out.println("on it first");
			
		}
		else if(level<=3){
			System.out.println("ok");
			return;
		}
		else if(level>3){
			System.out.println("loud");
			return;
		}
		else if(level>5){
			System.out.println("too loud");
			return;
		}
		else if(level>9){
			System.out.println("call police");
			return;
		}
	}	

	public static boolean turnOn()
	{
		System.out.println("invoked start");
		return true;
	}
	public static boolean turnOff()
	{
		System.out.println("invoked stop");
		return false;
	}
	
	public static int currentLevel(){
		System.out.println("invoked currentLevel");
		int level=6;
		System.out.println(level);
		return level;
	}
}
	