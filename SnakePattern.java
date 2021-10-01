public class SnakePattern
{

    public static void SnakePattern(int [][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<mat[i].length;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int j=mat[i].length-1;j>=0;j--)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        int [][] mat = { {1,2,3,4},{3,4,5},{7,5,2,0},{9,4,6,5,1,3}};
        SnakePattern(mat);
    }
}
