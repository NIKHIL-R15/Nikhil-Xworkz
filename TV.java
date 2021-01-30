class Tv
{
static String brandName = "LG";
static boolean tvIsOn = true;
static int channelNo = 25;
static int maxChannelNo = 50;
public static void main(String a [])
{
System.out.println("The name of the TV is " + brandName);
changeChnl();
changeChnl();
changeChnl();
}
public static void changeChnl()
{
if(tvIsOn)
{
if(channelNo<maxChannelNo)
{
channelNo=channelNo+1; 
}
System.out.println("The current channel is "+ channelNo);
}
}
}