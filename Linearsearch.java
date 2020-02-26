import java.util.Scanner;
class Linearsearch
{
public static int linearsearch(int []arr,int key)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==key)
{
return i;
}
}
return -1;
}
public static void main(String a[])
{
int[] a1={10,20,30,40,50,60,70,80};
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to be search");
int key=sc.nextInt();
System.out.println(key+ "is found at index:" +linearsearch(a1,key));
}
}








