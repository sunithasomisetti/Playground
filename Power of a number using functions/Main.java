import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exponent=sc.nextInt();
      int res=power(base,exponent);
      System.out.print(res);
    }
  public static int power(int m,int n)
  {
    int temp=1;
    while(n>0)
    {
      temp=temp*m;
      n--;
    }
    return temp;
  }
	    // Type your code here
	
}