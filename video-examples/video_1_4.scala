//Conditionals and Value Definitions

//if-else Java

//expression >> not statements
def abs(x: Int) = if (x >= 0) x else -x
//

if(b) e1 else e2

if(true) e1 else e2
e1

if(false) e1 else e2
e2

//
//def >> CBN
def square(x: Double) = x * x

//val >> CBV
val x = 2
val y = square(x)


def loop: Boolean = loop
def x = loop

val x = loop //lead to a infinite loop
//it will be evaluated at the point of the finish
//

//
and(x, y)
//and(x, y) == x && y
def and(x: Boolean, y: => Boolean) = if (x) y else false //CBN
def and(x: Boolean, y: => Boolean) = if (!x) false else y

or(x, y)
def or(x: Boolean, y: => Boolean) = if (x) true else y
def or(x: Boolean, y: => Boolean) = if (!x) y else true
//

//
//Tests Exercise
def and(x: Boolean, y: Boolean) = if (x) y else false //CBV
//always be evaluated
def and(false, loop) //infinite loop

def and(x: Boolean, y: => Boolean) = if (x) y else false //CBN
def and(false, loop)
false
//
