object week1 {

  1 + 2                                           //> res0: Int(3) = 3
  
  def abs(x: Double) = if(x < 0) -x else x        //> abs: (x: Double)Double
  
	def sqrt(x: Double) = {
	  
	  def sqrtIter(guess: Double): Double =
	  	if(isGoodEnough(guess)) guess
	  	else sqrtIter(improve(guess))
	  	
	  def isGoodEnough(guess: Double) =
	  	abs(guess * guess - x) / x < 0.001
	  	
	  def improve(guess: Double) =
	  	(guess + x / guess) / 2

	  sqrtIter(1.0)
   
  }                                               //> sqrt: (x: Double)Double
  
  sqrt(2)                                         //> res1: Double = 1.4142156862745097
  sqrt(4)                                         //> res2: Double = 2.000609756097561
  sqrt(5)                                         //> res3: Double = 2.2360688956433634
  sqrt(1)                                         //> res4: Double = 1.0
  sqrt(0.5)                                       //> res5: Double = 0.7071078431372548
  
  val x = 0                                       //> x  : Int = 0
  def f(y: Int) = y + 1                           //> f: (y: Int)Int
	val result = {
		val x = f(3)
		x * x
	} + x                                     //> result  : Int = 16
	
	x                                         //> res6: Int = 0
	
}