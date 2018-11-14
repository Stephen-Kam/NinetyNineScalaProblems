class WorkingWithLists {

}

object P01 {

  //P01: Find the last element of a list
  def last[T](x: List[T]): T = ???
}

object P02 {

  //P02: Find the last but one element of a list.
  def penultimate[T](x: List[T]): T = ???
}

object P03 {

  //P03: Find the Kth element of a list
  def nth[T](n: Int, x: List[T]): T = ???
}

object P04 {

  //P04: Find the number of elements of a list
  def length[T](x: List[T]): Int = ???
}

object P05 {

  //P05: Reverse a list.
  def reverse[T](x: List[T]): List[T] = ???
}

object P06 {

  //P06: Reverse a list.
  def isPalindrome[T](x: List[T]): List[T] = ???
}

object P07 {

  //P07: Flatten a nested structure
  //Note: you may need to change the parameter
  def flatten[T](x: List[T]*): T = ???
}

object P08 {

  //P08: Eliminate consecutive duplicates of list elements
  def compress[T](x: List[T]): List[T] = ???
}

object P09 {

  //P09: Pack consecutive duplicates of list elements into sublists
  //Note: you may need to change the return type
  def pack[T](x: List[T]): List[List[T]] = ???
}

object P10 {

  //P10: Run-length encoding of a list
  //Note: you may need to change the return type
  def encode[T](x: List[T]): List[T] = ???
}

