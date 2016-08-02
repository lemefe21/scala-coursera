package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if(c == 0 || c == r || r == 0) 1 
      else pascal(c - 1, r - 1) + pascal(c, r - 1) 

  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def verific(chars: List[Char], numOpens: Int): Boolean = {
        //chars.isEmpty: Boolean returns whether a list is empty
        if(chars.isEmpty){
          numOpens == 0
        } else {
          //chars.head: Char returns the first element of the list
          var headChar = chars.head
          var countOpens =
            if(headChar == '(') numOpens + 1
            else if(headChar == ')') numOpens - 1
            else numOpens
            //chars.tail: List[Char] returns the list without the first element
          if(countOpens >= 0) verific(chars.tail, countOpens)
          else false
        }
      }
      verific(chars, 0)        
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
