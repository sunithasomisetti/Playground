import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last=n%10;
      while(n>=10)
      {
        n=n/10;
      }
      int first=n;
      int sum=first+last;
      System.out.println(sum);
      
	    // Type your code here
	}
}