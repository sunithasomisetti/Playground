import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int len=str.length();
    int end=len-1;
    int front=0;
    boolean matching=true;
    while(front<end)
    {
      if(str.charAt(front)!=str.charAt(end))
      {
        matching=false;
        break;
      }
      front++;
      end--;
    }
      if(matching==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    
      
    } 
}