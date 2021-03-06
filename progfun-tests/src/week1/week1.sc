object week1 {
  1 + 2                                           //> res0: Int(3) = 3
  def abs(x: Double) = if(x < 0) -x else x        //> abs: (x: Double)Double
  
  def isGoodEnough(guess: Double, x: Double) =
  	abs(guess * guess - x) / x < 0.001        //> isGoodEnough: (guess: Double, x: Double)Boolean
  	
  def improve(guess: Double, x: Double) =
  	(guess + x / guess) / 2                   //> improve: (guess: Double, x: Double)Double
  
  def sqrtIter(guess: Double, x: Double): Double =
  	if(isGoodEnough(guess, x)) guess
  	else sqrtIter(improve(guess, x), x)       //> sqrtIter: (guess: Double, x: Double)Double
  	
  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double
  
  sqrt(2)                                         //> res1: Double = 1.4142156862745097
  sqrt(4)                                         //> res2: Double = 2.000609756097561
  sqrt(5)                                         //> res3: Double = 2.2360688956433634
  sqrt(1)                                         //> res4: Double = 1.0
  sqrt(0.5)                                       //> res5: Double = 0.7071078431372548
  
}