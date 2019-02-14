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
      int largest=arr[0];
      for(int i=1;i<arrsize;i++)
      {
          if(largest<arr[i])
          {
            largest=arr[i];
          }
      }
      System.out.print(largest);

    }
}