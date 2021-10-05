class LighterRunner{
	public static void main(String[] values)
	{
		Lighter.light(19);
		boolean value=Lighter.On();
		boolean exp=Lighter.off();
		System.out.println(value);
		System.out.println(exp);
		boolean good=true;
		boolean bad=false;
		System.out.println(value==good);
		System.out.println(exp==bad);
		
		int wdt=Lighter.currentWidth();
		System.out.println(wdt);
	}
}
		