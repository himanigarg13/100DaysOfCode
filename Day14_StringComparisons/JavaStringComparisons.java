//Given a string,s, and an integer,k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {


    
    int L=0,S=0;
    for (int i = 0; i <=s.length()-k; i++) {
        String str1=s.substring(L,L+k);
        String str3=s.substring(S,S+k);
        String str2=s.substring(i,i+k);
        if (str2.compareTo(str3)<0) {
            S=i;
        }
        if (str2.compareTo(str1)>0) {
            L=i;
        }
    }
     String smallest =s.substring(S,S+k);
    String largest = s.substring(L,L+k);
    return smallest + "\n" + largest;
}
        

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
