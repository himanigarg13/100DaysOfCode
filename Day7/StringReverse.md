A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints
A will consist at most 50 lower case english letters.

Sample Input:
madam

Sample Output:
Yes

1. Example 1:
Input: A = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

2. Example 2:
Input: A = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

3. Example 3:
Input: A = " "
Output: true


LOGIC: 

We entered an string by user.

Then,

We started a loop till the length of Inputed string .

And we are storing each character of string in S .

And transferring it to a new string variable character wise.


Then we are using IF condition to check whether the string reversed is same as entered to check palindrome.

If condition is true printing yes

Else

Printing No
