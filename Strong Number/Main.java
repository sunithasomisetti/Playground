import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int sum=0;
      while(n>0)
      {
        int r=n%10;
        int fact=1;
        for(int i=1;i<=r;i++)
        {
          fact=fact*i;
        }
        n=n/10;
        sum=sum+fact;
      }
      if(sum==temp)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
	    // Type your code here
	}
}