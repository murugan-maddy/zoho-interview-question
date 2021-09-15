import java.util.*;
import java.lang.*;
public class game_help
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user should get a value to know the lenth of the array
		int a=sc.nextInt();
		int arr[]=new int[a];
		int sum1=0,sum2=0;
		for(int i=0;i<a;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i+=2)
		{
		    sum1+=arr[i];
		}
		for(int i=1;i<a;i+=2)
		{
		    sum2+=arr[i];
		}
		if(sum1>sum2)
		{
		    System.out.print("Second");
		}
		 else if(sum1==sum2)
		 {
		     System.out.print("Draw");
		 }
		else
		{
		    System.out.print("First");
		}
	}
}
