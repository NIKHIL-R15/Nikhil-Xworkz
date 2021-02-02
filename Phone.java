class Phone
{

public static void main(String a[])
{
ring();
ring("KGF");
}
public static void ring()
{
System.out.println("Your ringtone is set to default tone");
}
public static void ring(String ring)
{
System.out.println("Your ringtone is changed to " + ring);
}
}