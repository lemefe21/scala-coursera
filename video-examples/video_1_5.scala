//Square Roots with Newton's method
//Raiz quadrada

def sqrt(x: Double): Double =

//right-hand side calls itself
package main
object MainTest extends App{

  def abs(x: Double) = if(x < 0) -x else x

  def isGoodEnough(guess: Double, x: Double) =
  	abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =
  	(guess + x / guess) / 2

  def sqrtIter(guess: Double, x: Double): Double =
  	if(isGoodEnough(guess, x)) guess
  	else sqrtIter(improve(guess, x), x)

  def sqrt(x: Double) = sqrtIter(1.0, x)

  println(sqrt(2))
}

//Debuging...
println(sqrt(2))

>>  x	    2.0
def sqrt(x: Double) = sqrtIter(1.0, x)

>>  guess	1.0
>>  x	    2.0
def sqrtIter(guess: Double, x: Double): Double =
  if(isGoodEnough(guess, x)) guess
  //if(isGoodEnough(1.0, 2.0)) guess

>>  guess	1.0
>>  x	    2.0
def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x) / x < 0.001
  //abs(1.0 * 1..0 - 2.0) / x < 0.001

>>  x	    -1.0
def abs(x: Double) = if(x < 0) -x else x
  //if(-1.0 < 0) -(-1.0) else -1.0

>>  guess	1.0
>>  x	    2.0
def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x) / x < 0.001
  //1.0 / 2.0 < 0.001
  //false

>>  guess	1.0
>>  x	    2.0
def sqrtIter(guess: Double, x: Double): Double =
  if(isGoodEnough(guess, x)) guess
  //if(false) guess

>>  guess	1.0
>>  x	    2.0
  else sqrtIter(improve(guess, x), x)
  //else sqrtIter(improve(1.0, 2.0), x)

>>  guess	1.0
>>  x	    2.0
def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2
  //(1.0 + 2.0 / 1.0) / 2
  //1,5

>>  guess	1.0
>>  x	    2.0
def sqrtIter(guess: Double, x: Double): Double =
  //if
  else sqrtIter(improve(guess, x), x)
  //else sqrtIter(1,5, 2.0)

// >> recursão
>>  guess	1.5
>>  x	    2.0
def sqrtIter(guess: Double, x: Double): Double =
  if(isGoodEnough(guess, x)) guess

>>  guess	1.5
>>  x	    2.0
def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x) / x < 0.001

>>  x     0.25
def abs(x: Double) = if(x < 0) -x else x


////////////////////////


if(isGoodEnough(guess, x)) guess

else sqrtIter(improve(guess, x), x)       //21
  guess	1.0
  x	2.0

(guess + x / guess) / 2                   //17
  guess	1.0
  x	2.0

else sqrtIter(improve(guess, x), x)       //21
  guess	1.0
  x	2.0

if(isGoodEnough(guess, x)) guess          //20
  guess	1.5
  x	2.0

abs(guess * guess - x) / x < 0.001        //14
  guess	1.5
  x	2.0

def abs(x: Double) = if(x < 0) -x else x  //11
  x	0.25

abs(guess * guess - x) / x < 0.001        //14
  guess	1.5
  x	2.0

if(isGoodEnough(guess, x)) guess          //20
  guess	1.5
  x	2.0

else sqrtIter(improve(guess, x), x)       //21
  guess	1.5
  x	2.0

(guess + x / guess) / 2                   //17
  guess	1.5
  x	2.0

else sqrtIter(improve(guess, x), x)       //21
  guess	1.5
  x	2.0

if(isGoodEnough(guess, x)) guess          //20
  guess	1.4166666666666665
  x	2.0

abs(guess * guess - x) / x < 0.001        //14
  guess	1.4166666666666665
  x	2.0

def abs(x: Double) = if(x < 0) -x else x  //11
  x	0.006944444444444198

abs(guess * guess - x) / x < 0.001        //14
  guess	1.4166666666666665
  x	2.0

if(isGoodEnough(guess, x)) guess          //20
  guess	1.4166666666666665
  x	2.0

else sqrtIter(improve(guess, x), x)       //21
  guess	1.4166666666666665
  x	2.0

(guess + x / guess) / 2                   //17
  guess	1.4166666666666665
  x	2.0

else sqrtIter(improve(guess, x), x)       //21
  guess	1.4166666666666665
  x	2.0

if(isGoodEnough(guess, x)) guess          //20
  guess	1.4142156862745097
  x	2.0

abs(guess * guess - x) / x < 0.001        //14
  guess	1.4142156862745097
  x	2.0

def abs(x: Double) = if(x < 0) -x else x  //11
  x	6.007304882427178E-6

abs(guess * guess - x) / x < 0.001        //14
  guess	1.4142156862745097
  x	2.0

if(isGoodEnough(guess, x)) guess          //20
  guess	1.4142156862745097
  x	2.0

def sqrtIter(guess: Double, x: Double): Double =  //19
  guess	1.4142156862745097
  x	2.0

def sqrt(x: Double) = sqrtIter(1.0, x)    //23
  x	2.0

println(sqrt(2))
1.4142156862745097
