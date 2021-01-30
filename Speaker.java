class Speaker
{
static String brandName;
static boolean isConnected = true;
static int currentVol = 15;
static int maxVol = 40;
public static void main(String a [])
{
brandName = "Bose";
double price = 2400;
System.out.println("Name of the Speaker:"+brandName);
System.out.println("Price : "+price);
increaseVol();
}
public static void increaseVol()
{
if(isConnected)
{
if(currentVol<maxVol)
{
currentVol=currentVol+1;
}
System.out.println("The curernt volume is:"+currentVol);
}
}
}
}
