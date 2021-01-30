class Television
{
static boolean powerOn = true;
static String modelName = "Samsung QLED";
static float price = 44999.99F;
static int size = 55;
static int currentVol = 35;
static int maxVol = 100;
static int minVol = 0;
public static void main(String a[])
{
System.out.println("The model name is: "+modelName);
System.out.println("Deal price is: " +price);
System.out.println("Its size is " + " inches");
riseVol();
riseVol();
}
public static void riseVol()
{
if(powerOn)
{
if(currentVol<maxVol)
{
currentVol+=5;
}
System.out.println("The current volume is : " + currentVol);
}
}

}