import java.io.*;
import java.util.*;
class Box
{
double dimensions(int w,int h,double d)
{
double v;
v=w*h*d;
return v;
}
public static void main(String args[])
{
Box b=new Box();
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b1=sc.nextInt();
double c=sc.nextDouble();
double n=b.dimensions(a,b1,c);
System.out.println("volume is :"+n);
}
}



