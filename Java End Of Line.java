import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String str;
        int i = 1;
        while (scanner.hasNext())
        {
            str = scanner.nextLine();
            System.out.print(Integer.toString(i++) + ' ' + str + '\n');
            
        }

    }
}
