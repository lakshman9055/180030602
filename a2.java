import java.io.*;
import java.util.*;
class a2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int []a=new int[]{2,6,4,8,1};
for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]+" \n");
}
Arrays.sort(a);
System.out.println("minimum value is : "+a[0]);
System.out.println("maximum value is : "+a[a.length-1]);
}
}
