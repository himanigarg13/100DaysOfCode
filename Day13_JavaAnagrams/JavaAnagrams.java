/*
In this program i have taken two string & checked whether the given string is anagram or not & took input from the user.
Two string are anagram of each other when there will be same number of character present in them & also they are repeating for the same number of time.
Ande also both the string should be in same upper or lower case.
Sample input:
Test case 1
anagram
margana
Sample output:
Anagrams
Sample input:
Test case 2
anagramm
marganaa
Sample output:
Not Anagrams
Sample input:
Test case 3
Hello
hello
Sample output:
Anagrams
*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String s1 , String s2){
    // Complete the function
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

        {
            int[] a = new int[256];
            int[] b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                a[(int) s1.charAt(i)] += 1;
                b[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        } else
        {
            return false;
        }
    }
    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
