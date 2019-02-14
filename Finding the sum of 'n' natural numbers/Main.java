import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(sum(n));
  }
  public static int sum(int x)
  {
    if(x==0)
    {
      return 0;
    }
    else if(x==1)
    {
      return 1;
    }
    else
    {
      return x+sum(x-1);
    }
  }
}