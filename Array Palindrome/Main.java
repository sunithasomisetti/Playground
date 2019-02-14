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
      int first=0;
      int last=n-1;
      boolean ispalindrome=true;
      while(first<=last)
      {
        if(arr[first]!=arr[last])
        {
          ispalindrome=false;
          break;
        }
        first++;
        last--;
      }
      if(ispalindrome==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}
  
        
      
        
        
   