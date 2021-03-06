//Blocks and Lexical Scope

//block

def abs(x: Double) = if(x < 0) -x else x        //> abs: (x: Double)Double

  def sqrt(x: Double) = {

  def sqrtIter(guess: Double, x: Double): Double =
    if(isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  sqrtIter(1.0, x)

}

//to long expression

(someLongExpression
+ someOtherLongExpression)

//or

someLongExpression +
someOtherLongExpression
