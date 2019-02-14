import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int matrix1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
       matrix1[i][j]=sc.nextInt();
      }
    }
    int matrix2[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
       matrix2[i][j]=sc.nextInt();
      }
    }
    int res[][]=new int[r][c];
    subtract(matrix1,matrix2,res);
    display(res);
  }
  public static void subtract(int matrix1[][],int matrix2[][],int res[][])
  {
    for(int i=0;i<=res.length-1;i++)
    {
      for(int j=0;j<=res[i].length-1;j++)
      {
        res[i][j]=matrix1[i][j]-matrix2[i][j];
      }
    }
  }
  public static void display(int res[][])
  {
    for(int i=0;i<=res.length-1;i++)
        {
          for(int j=0;j<=res[i].length-1;j++)
          {
            System.out.print(res[i][j]+" " );
          }
          System.out.println();
        }
  }
}

        