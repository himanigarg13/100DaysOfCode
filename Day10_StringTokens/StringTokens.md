 We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.



Input Format:


A single string,s.

Output Format:


On the first line, print an integer, n, denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

StringTokenizer class in Java is used to break a string into tokens. A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed. A token is returned by taking a substring of the string that was used to create the StringTokenizer object. It provides the first step in the parsing process often called lexer or scanner. The String Tokenizer class allows an application to break strings into tokens. It implements the Enumeration interface. This class is used for parsing data. To use String Tokenizer class we have to specify an input string and a string that contains delimiters. Delimiters are the characters that separate tokens. Each character in the delimiter string is considered a valid delimiter. Default delimiters are whitespaces, new line, space, and tab. 
