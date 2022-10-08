Given a string,s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1. You'll find the String class' substring method helpful in completing this challenge.

Input Format:

The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.


Output Format:

Print the substring in the inclusive range from start to end-1.


LOGIC:

Read a word.

Pick a random position i in the word, but not the last position.

Pick a random position j > i in the word.

Swap the letters at positions j and i.

And we are storing each character of string in S .

And transferring it to a new string variable character wise.

Print the substring.

