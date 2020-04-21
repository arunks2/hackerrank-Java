import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        int a,b,n;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int s = a;
            for(int j=0;  j<n;j++) {
                s += (int)(b*Math.pow(2,j));
                System.out.print(Integer.toString(s) + ' ');
            }
            System.out.print('\n');
        }
        in.close();
    }
}
