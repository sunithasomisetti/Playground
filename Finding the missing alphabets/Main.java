import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int len = sb.length();
        int arr[] = new int[26]; 
        for(int idx = 0; idx < 26; idx++){
            arr[idx] = 0;
        }
        for(int idx = 0; idx < len; idx++)
        {
            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
            {
              arr[sb.charAt(idx)-'A']++;
            }
            if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
            {
              arr[sb.charAt(idx)-'a']++;
            }
        }
      for(int i=0;i<26;i++)
      {
        if(arr[i]==0)
        {
          char missing=(char)(i+'a');
          System.out.print(missing+ " ");
        }
      }
    }
}
    
    