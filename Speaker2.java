class Speaker
{
static String brandName;
static boolean powerOn = true;
static int currentVol = 25;
static int minVol = 0;
public static void main(String a [])
{
brandName = "Philips";
double price = 1500;
System.out.println("Name of the Speaker:"+brandName);
System.out.println("Price : "+price);
decreaseVol();
}
public static void decreaseVol()
{
if(powerOn)
{
if(currentVol>minVol)
{
currentVol=currentVol-1;

}
System.out.println("The curernt volume is:"+currentVol);
}
}
}
