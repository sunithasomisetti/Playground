import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(factorial(n));
  }
  public static int factorial(int x)
  {
    if(x==0)
    {
      return 1;
    }
    else if(x==1)
    {
      return 1;
    }
    else 
    {
      return x*factorial(x-1);
    }
  }
}

    
  