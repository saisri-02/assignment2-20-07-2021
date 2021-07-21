import java.util.*;
public class Deleteodd
{
static Stack<Integer> s=new Stack<Integer>();
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
System.out.println("Enter array elements : ");
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
insert(a,n);
remove(a,n);
display();
}
public static void insert(int a[],int n)
{
for(int i=0;i<n;i++)
s.push(a[i]);
System.out.println(s);
}
public static void remove(int a[],int n)
{
for(int i=0;i<n;i++)
{
if(a[i]%2==1)
{
s.remove(i);
}
}
}
public static void display()
{
System.out.println(s);
}
}

output:

Enter array size : 
4
Enter array elements : 
1 2 3 4
[1, 2, 3, 4]
[2, 4]