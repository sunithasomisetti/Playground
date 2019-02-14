import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int large=arr[0];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++)
    {
      if(large<arr[i])
      {
        large=arr[i];
      }
    }
    for(int j=0;j<n;j++)
    {
      if (large==arr[j])
      {
        System.out.print(j);
      }
    }
    //Try your code here
  }
}