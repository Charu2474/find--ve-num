import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner gh=new Scanner(System.in);
        int n=gh.nextInt();
        int m=gh.nextInt();
        int x[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                x[i][j]=gh.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(x[i][j]<0)
                {
                    c++;
                }
                else
                {
                    continue;
                }
            }
        }
        System.out.println(c);
    }
}
