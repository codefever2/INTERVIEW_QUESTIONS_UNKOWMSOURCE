import java.util.*;
public class infectedperson
{
    public static void main(String[] args)
    {
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
                b[i][j]= a[i][j];
            }
        }
        boolean x = true;
        int counter = 0;
       do
        {
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    if(b[i][j]== 1)
                    {
                        if((i+1 <= 3) &&(b[i+1][j] != 1))
                        {
                            a[i+1][j]= 1;
                        }
                        if((i-1 >= 0) &&(b[i-1][j] != 1))
                        {
                            a[i-1][j]= 1;
                        }
                        if((j-1 >= 0) &&(b[i][j-1] != 1))
                        {
                            a[i][j-1]= 1;
                        }
                        if((j+1 <= 3)&&(b[i][j+1]!= 1))
                        {
                            a[i][j+1]= 1;
                        }
                        a[i][j]=1;
                    }
                }
            }
            counter++;
            int temp=0;
            for(int k=0;k<4;k++)
            {
                for (int z = 0; z < 4; z++)
                {
                    b[k][z]=a[k][z];
                }
            }
            for(int k=0;k<4;k++)
            {
                for(int z =0;z<4;z++)
                {
                    if (a[k][z]==0)
                    {
                        x = true;
                        temp = 1;
                        break;
                    }
                }
            }
            if(temp==0)
            {
                x=false;
            }

        }while(x);
        System.out.println(counter);
    }
}
