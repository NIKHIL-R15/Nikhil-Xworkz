class Phone
{
static double price = 44999.99;
public static void main(String a[])
{
double total = ring(price);
System.out.println(total);
ring();
ring("KGF");
}
public static double ring(double price)
{
return price;
}
public static void ring()
{
System.out.println("Your ringtone is set to default tone");
}
static void ring(String ring)
{
System.out.println("Your ringtone is changed to " + ring);
} 
}