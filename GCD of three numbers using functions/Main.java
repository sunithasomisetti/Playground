import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int temp=gcd(n1,n2);
      System.out.println(gcd(temp,n3));
    }
  public static int gcd(int a,int b)
  {
    int min,gd=0;
    min=a>b?a:b;
    while (min>=1)
    {
      if((a%min==0)&&(b%min==0))
      {
        gd=min;
        break;
      }
      min--;
    }
    return gd;
  }
}
     
	