This is the code for given question
class Solution
{
    public long reverse_digit(long n)
    {
        
        long reversed = 0;
        while(n!= 0 ){
            long digit = n%10;
            reversed = reversed *10 + digit;
            n = n/10;
        }
        return reversed;
    }
}

Given number: 200

reversed is initialized to 0.
We enter the while loop:

Iteration 1:

digit is 200 % 10 = 0.
reversed becomes 0 * 10 + 0 = 0.
n becomes 200 / 10 = 20.
  
Iteration 2:

digit is 20 % 10 = 0.
reversed becomes 0 * 10 + 0 = 0.
n becomes 20 / 10 = 2.
  
Iteration 3:

digit is 2 % 10 = 2.
reversed becomes 0 * 10 + 2 = 2.
n becomes 2 / 10 = 0.
The while loop ends because n becomes 0.
The function returns the reversed value, which is 2.
So, for the given number 200, the function will return 2.

Let's do another example:

Given number: 122

reversed is initialized to 0.
We enter the while loop:

Iteration 1:
digit is 122 % 10 = 2.
reversed becomes 0 * 10 + 2 = 2.
n becomes 122 / 10 = 12.
  
Iteration 2:

digit is 12 % 10 = 2.
reversed becomes 2 * 10 + 2 = 22.
n becomes 12 / 10 = 1.
  
Iteration 3:

digit is 1 % 10 = 1.
reversed becomes 22 * 10 + 1 = 221.
n becomes 1 / 10 = 0.
The while loop ends because n becomes 0.
The function returns the reversed value, which is 221.
So, for the given number 122, the function will return 221.






