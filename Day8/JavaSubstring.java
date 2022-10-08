/*The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String ans="";
        for(int i=start;i<end;i++)
        {
        ans=ans+S.charAt(i);
        }
        System.out.println(ans);
      }
    }
