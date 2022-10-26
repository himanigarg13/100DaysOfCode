//You have to check whether the syntax of the given pattern is valid.
//The first line of input contains an integer N, denoting the number of test cases. The next N lines contain a string of any printable characters representing the pattern of a regex.

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
            try {
                  Pattern p = Pattern.compile(pattern);
                  System.out.println("Valid");
              }
              catch(Exception e) {
                  System.out.println("Invalid");
              }
              testCases--;
        }
        
        in.close();
    }
		}
	
