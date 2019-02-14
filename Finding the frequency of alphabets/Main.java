import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int len = sb.length();
        int arr[] = new int[70]; 
        for(int idx = 0; idx < 70; idx++){
            arr[idx] = 0;
        }
        for(int idx = 0; idx < len; idx++)
        {
            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
            {
                int offset = sb.charAt(idx) - 'A';
                char ch = (char)('a' + offset);
                sb.setCharAt(idx, ch);
            }
            if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
            {
                arr[sb.charAt(idx) - 'a']++;
            }  
        }
        for(int i = 0; i < len; i++)
        {
            if(arr[sb.charAt(i) -'a'] != 0)
            {
                System.out.print(sb.charAt(i) +"" +arr[sb.charAt(i)-'a'] + " ");
                arr[sb.charAt(i) -'a'] = 0;
            }
        }
    }
}