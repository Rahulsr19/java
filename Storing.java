class Storing
{
public static void setAndDisplaybrand(String quality,String Price,String color,String height,String[] brands)
{
System.out.println("invoked setAndDisplaybrands");
System.out.println("quality:"+quality);
System.out.println("Price:"+Price);
System.out.println("color:"+color);
System.out.println("height:"+height);
		
for(int brandIndex=0;brandIndex<brands.length;)
{
String brand=brands[brandIndex];
System.out.println(brand);
//break;
brandIndex++;
}
}
}