public class OuterDiamond{
	public static void main(String[] args){
		int num=9;
		int mid=num/2;
		for(int i=0; i<num; i++){
			for(int j=0;j<num;j++0){
				if((i+j<=mid||j-i>=mid)||(i-j>=mid||i-j
				>=num+mid-1))
					System,out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
}
				
				
