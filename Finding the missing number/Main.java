import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int missing=0;
      //boolean isfound=false;
      for(int value=1;value<=n;value++)
      {
        boolean isfound=false;
        for(int i=0;i<n;i++)
        {
          if(arr[i]==value)
          {
            isfound=true;
            break;
          }
        }
        if(isfound==false)
        {
          missing=value;
          break;
        }
      }
      System.out.print(missing);
    }
}
    