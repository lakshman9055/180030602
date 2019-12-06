import java.io.*;
import java.util.*;
class a1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int []a=new int[]{2,3,4,5,6};
for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]+" ");
}
int sum=0;
for(int i=0;i<a.length;i++)
sum=sum+a[i];
System.out.print("\n "+sum+" \n");
int avg=sum/a.length;
System.out.print(" "+avg+" ");
}
}