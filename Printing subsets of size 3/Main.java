import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = sc.nextInt();
       }
       // Function call
       subsets(arr_size, arr);
    }
    public static void subsets(int arr_size, int arr[])
    {
        for(int index1 = 0; index1 <= arr_size - 2; index1++)
        {
            for(int index2 = index1 + 1; index2 <= arr_size - 1; index2++)
            {
                for(int index3 = index2 + 1; index3 <= arr_size - 1; index3++)
                {
                    System.out.print("(" + arr[index1] + "," + " " + arr[index2] + "," + " " + arr[index3] + ")" + " ");
                }
            }
            System.out.println();
        }
    }
}