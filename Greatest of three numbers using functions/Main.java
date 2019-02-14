import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int temp=greatest(n1,n2);
      System.out.println(greatest(temp,n3));
    }
  public static int greatest(int a,int b)
  {
    int large=a>b?a:b;
    return large;
  }
      
	    // Type your code here
	
}