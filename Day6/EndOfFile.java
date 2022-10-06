/* The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int line = 0;
    
    while(sc.hasNextLine()){
        line++;
        System.out.println(line+" "+sc.nextLine());
        
    }

    }
    
}
