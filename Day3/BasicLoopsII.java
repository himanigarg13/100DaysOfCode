/*You are given q queries in the form of a,b, and n. For each query, print the series corresponding to the given a,b , and n values as a single line of n space-separated integers.

Input Format:
The first line contains an integer,q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ai , bi, and ni values for that query.*/

import java.util.*;
import java.io.*;

public class Day3Loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           int result = a + (int) Math.pow(2, 0) * b;
            System.out.print(result + " ");
            for(int j=1; j<n; j++){
                result += (int) Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println(); 
        }
        in.close();
    }
}


