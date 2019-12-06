import java.io.*;
import java.util.*;
class a6
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int []a=new int[]{2,6,4,8,1};
for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]+" ");
}
System.out.println();
Arrays.sort(a);
for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]+" ");
}
}
}
