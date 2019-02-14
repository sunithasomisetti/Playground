import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int arrsize=sc.nextInt();
      int arr[]=new int[arrsize];
      for(int i=0;i<arrsize;i++)
      {
        arr[i]=sc.nextInt();
      }
      int search1=sc.nextInt();
      int search2=sc.nextInt();
      int temp1=0;
      int temp2=0;
      for(int i=0;i<arrsize;i++)
      {
        if(search1==arr[i])
        {
          temp1=1;
          System.out.println(i);
        }
      }
      for(int i=0;i<arrsize;i++)
      {
        if(search2==arr[i])
        {
          temp2=1;
          System.out.println(i);
        }
      }
      if(temp1==0){
        System.out.println("-1");
      }
      if(temp2==0){
        System.out.print("-1");
      }
      
      
          
        
    }
}