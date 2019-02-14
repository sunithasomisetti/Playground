import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
    int i=1,s=0;
    for(i=1;i<=m;i++)
    {
      s=s+i;
    }
    return s;
  }
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sun=sum(n);
      System.out.println(sun);
      
	    // Type your code here
	}
}