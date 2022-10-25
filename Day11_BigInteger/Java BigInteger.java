//There will be two lines containing two numbers,a and b.These numbers are so big that you can't contain them in any ordinary data types like a long integer.
//Use the power of Java's BigInteger class and solve this problem.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
         BigInteger sum = a.add(b);
          BigInteger prod = a.multiply(b);
        
        System.out.println(sum+"\n"+prod);
    }
}
