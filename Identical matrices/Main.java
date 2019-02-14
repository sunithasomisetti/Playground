import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int flag=0;
    int arr1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr1[i][j]=sc.nextInt();
      }
    }
    int arr2[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr2[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(arr1[i][j]!=arr2[i][j])
        {
          flag=1;
          break;
        }
      }
    }
    if(flag==0)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}

          
          