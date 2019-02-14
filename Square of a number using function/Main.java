import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
    int res=m*m;
    return res;
  }
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sun=square(n);
      System.out.print(sun);
    
  
	 // Type your code here   
	} 
}