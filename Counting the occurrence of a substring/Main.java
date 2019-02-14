import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String sub=sc.nextLine();
    int len1=str.length();
    int len2=sub.length();
    int count=0;
    for(int i=0;i<(len1-len2+1);i++)
    {
      boolean matching=true;
      for(int j=0;j<len2;j++)
      {
        if(str.charAt(i+j)!=str.charAt(j))
        {
          matching=false;
        }
      }
      if(matching==true)
      {
        count++;
      }
    }
    System.out.print(count);
  }
}
        
    
  