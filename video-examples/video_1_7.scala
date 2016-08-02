//Tail Recursion

//greatest common divisor of two number

def gcd(a: Int, b: Int): Int =
  if(b == 0) a else gcd(b, a % b)

//example

gcd(14, 21)

> if(21 == 0) 14 else gcd(21, 14 % 21)
> if(false) 14 else gcd(21, 14 % 21)
> gcd(21, 14 % 21)
> gcd(21, 14)
> if(14 == 0) 21 else gcd(14, 21 % 14)
> if(false) 21 else gcd(14, 21 % 14)
> gcd(14, 21 % 14)
> gcd(14, 7)
> gcd(7, 0)
> if(0 == 0) 7 else gcd(0, 7 % 0)
> if(true) 7
> 7

//example factorial >> not tail recursion

def factorial(n: Int): Int =
  if(n == 0) 1 else n * factorial(n - 1)

factorial(4)

> if(4 == 0) 1 else 4 * factorial(4 - 1)
> if(false) 1 else 4 * factorial(3)
> 4 * factorial(3)
> 4 * if(3 == 0) 1 else 3 * factorial(3 - 1)
> 4 * if(false) 1 else 3 * factorial(2)
> 4 * (3 * factorial(2))
> 4 * (3 * if(2 == 0) 1 else 2 * factorial(2 - 1))
> 4 * (3 * if(false) 1 else 2 * factorial(1))
> 4 * (3 * (2 * factorial(1)))
> 4 * (3 * (2 * if(1 == 0) 1 else 1 * factorial(1 - 1)))
> 4 * (3 * (2 * if(false) 1 else 1 * factorial(0)))
> 4 * (3 * (2 * (1 * factorial(0))))
> 4 * (3 * (2 * (1 * if(0 == 0) 1 else 0 * factorial(0 - 1))))
> 4 * (3 * (2 * (1 * if(true) 1)))
> 4 * (3 * (2 * (1 * 1)))
> 120

//example factorial >> with Any tail recursion
//in eclipse

//Exercise 1 - Pascal's Triangle
//https://gist.github.com/ngocdaothanh/3764694

//pascal(1,3)
def pascal(c: Int, r: Int): Int =
  if(c == 0 || c == r) 1
  else pascal(c - 1, r - 1) + pascal(c, r - 1)

pascal(3, 4)

> if(3 == 0 || 3 == 4) 1
> if(false) 1
> else pascal(3 - 1, 4 - 1) + pascal(3, 4 - 1)
> else pascal(2, 3) + pascal(3, 3)
> (else pascal(2 - 1, 3 - 1) + pascal(2, 3 - 1) + 1)
> (else pascal(1, 2) + pascal(2, 2) + 1)
> ((else pascal(1 - 1, 2 - 1) + pascal(1, 2 - 1) + 1) + 1)
> ((else pascal(0, 1) + pascal(1, 1) + 1) + 1)
> (((1 + 1) + 1) + 1)
> 4

pascal(2, 4)

> if(2 == 0 || 2 == 4) 1
> if(false) 1
> else pascal(2 - 1, 4 - 1) + pascal(2, 4 - 1)
> else pascal(1, 3) + pascal(2, 3)

> (else pascal(1 - 1, 3 - 1) + pascal(1, 3 - 1)) + (else pascal(2 - 1, 3 - 1) + pascal(2, 3 - 1))
> (else pascal(0, 2) + pascal(1, 2)) + (else pascal(1, 2) + pascal(2, 2))

> 1 + (else pascal(1 - 1, 2 - 1) + pascal(1, 2 - 1)) + (else pascal(1 - 1, 2 - 1) + pascal(1, 2 - 1)) + 1
> 1 + (else pascal(0, 1) + pascal(1, 1)) + (else pascal(0, 1) + pascal(1, 1)) + 1
> 1 + (1 + 1) + (1 + (1) + 1) + 1
> 6
