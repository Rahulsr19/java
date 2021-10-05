class SpeakerRunner{
	public static void main(String[] args)
	{
		Speaker.volume(19);
		boolean value=Speaker.turnOn();
		boolean exp=Speaker.turnOff();
		System.out.println(value);
		System.out.println(exp);
		boolean good=false;
		boolean bad=true;
		System.out.println(value==good);
		System.out.println(exp==bad);
		
		
	}
}