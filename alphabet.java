import java.util.*;
import java.lang.*;
 class alphabet
   {
    static void value(String a)
    {
        char ch[]=a.toCharArray();
        char alpha=0;
        int num=0;
        for(int i=0;i<a.length();i++)
        {
            if(ch[i]>='a'&&ch[i]<='z' || ch[i]>='A'&&ch[i]<='Z')
            {
             if(alpha!=0)
             {
                 for(int j=0;j<num;j++)
                 System.out.printf("%c",alpha);
                 num=0;
             }
             alpha=ch[i];
            }
            else if(ch[i]>='0'&&ch[i]<='9')
                {
                   num=num*10+ch[i]-'0'; 
                }
        }
            for(int j=0;j<num;j++)
                 {
                     System.out.printf("%c",alpha);
                     
                 }
        }
    
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		value(a);
	}
}
