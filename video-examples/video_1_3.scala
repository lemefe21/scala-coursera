//Evaluation Strategies and Termination

def first(x: Int, y: Int) = x

//Call-By-Name
  first(1, loop)
  1


//Call-By-Value
  first(1, loop)
  //infinite loop

//Scala normally uses by value >> CBV
//but it type of a function parameter starts with => it uses CBN

def constOne(x: Int, y: => Int) = 1

//CBV
  constOne(1 + 2, loop)
  constOne(3, loop)
  1
  
//CBV
  constOne(loop, 1 + 2)
  //infinite loop
