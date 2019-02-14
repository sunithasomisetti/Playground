import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int sum1=0,sum2=0,sum3=0;
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<3;i++)
    {
      sum1=sum1+arr[i];
    }
    for(int i=3;i<6;i++)
    {
      sum2=sum2+arr[i];
    }
    if(sum1==sum2)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
    
    
    
  }
}