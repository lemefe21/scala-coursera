/* ------------------------------------------------------------------------ */

scala> def square(x: Double) = x * x
square: (Double)Double

scala> square(2)
4.0

scala> square(5 + 4)
81.0

scala> square(square(4))
256.0

scala> def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
sumOfSquares: (Double, Double)Double

/* ------------------------------------------------------------------------ */

//Call-By-Value

sumOfSquares(3, 2 + 2)
sumOfSquares(3, 4)
square(3) +  square(4)
3 * 3 + square(4)
9 + square(4)
9 + 4 * 4
9 + 16
25

/* ------------------------------------------------------------------------ */

//Changing the evaluation strategy
//Call-By-Name

sumOfSquares(3, 2 + 2)
square(3) + square(2 + 2)
3 * 3 + square(2 + 2)
9 + square(2 + 2)
9 + (2 + 2) * (2 + 2)
9 + 4 * 4
25

/* ------------------------------------------------------------------------ */

//Example evaluation strategy
def test(x: Int, y: Int) = x * x

//example by value and by name
  test(2, 3)
  2 * 2
  4 //Same

//01. by value
  test(3 + 4, 8)
  test(7, 8)
  7 * 7
  49 //more fast

//01. by name
  test(3 + 4, 8)
  (3 + 4) * (3 + 4)
  7 * (3 + 4)
  7 * 7
  49 //

//02. by value
  test(7, 2 * 4)
  test(7, 8)
  7 * 7
  49 //

//02. by name
  test(7, 2 * 4)
  7 * 7
  49 //more fast

//03. by value
  test(3 + 4, 2 * 4)
  test(3 + 4, 8)
  test(7, 8)
  7 * 7
  49 //Same

//03. by name
  test(3 + 4, 2 * 4)
  (3 + 4) * (3 + 4)
  7 * (3 + 4)
  7 * 7
  49 //Same
