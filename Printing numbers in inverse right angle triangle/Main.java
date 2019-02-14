import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          int num=n-(i-1);
          for(int j=1;j<=n-(i-1);j++)
          {
            System.out.print(num);
            num--;
          }
          System.out.print("\n");
        }
      }
    }
        
        
	    // Type your code here
