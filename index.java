import java.io.*;
import java.util.*;
class index
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
if(a[i]==i)
{
System.out.println("the number"+a[i]+"equals its index"+i);
}
}
}
}
