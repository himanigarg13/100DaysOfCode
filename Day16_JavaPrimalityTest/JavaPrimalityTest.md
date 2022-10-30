A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself. For example, the first six prime numbers are 2,3,5,7,11, and 13.


Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.


Input Format :

A single line containing an integer, n (the number to be checked).


Output Format : 

If n is a prime number, print prime; otherwise, print not prime.

Logic :

Prime number is a number, which have exactly two distinct natural number divisors, 1 and itself. The most naive approach to check whether a number is prime is to follow the definition. Algorithm to check number's n primality:

if number is 1, return false;
otherwise, for all integers m from 2 to n - 1, check if n is divisible by m. If it is, n is composite;
if no divisors were found, we can conclude, that n is prime.
Note. The 1 is not a prime number, because it doesn't satisfy the definition.
