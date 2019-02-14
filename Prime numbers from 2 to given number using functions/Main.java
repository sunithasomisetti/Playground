import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int a=2;a<=n;a++)
      {
        if (isprime(a))
          System.out.println(a);
      }
	}
  public static boolean isprime(int m)
  {
    boolean flag=true;
    for(int i=2;i<=m/2;i++)
    {
      if(m%i==0)
      {
        flag=false;
         break;
      }
    }
    return flag;
  }
    
}