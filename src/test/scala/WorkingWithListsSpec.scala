import org.scalatest.{FlatSpec, Matchers}

class WorkingWithListsSpec extends FlatSpec with Matchers {

  val list = List(1, 1, 2, 3, 5, 8)

  "A list" should "return the last value" in {
    P01.last(list) shouldBe 8
  }

//  it should "return the last but one element" in {
//    P02.penultimate(list) shouldBe 5
//  }
//
//  it should "return the kth element" in {
//    P03.nth(3, list) shouldBe 3
//  }
//
//  it should "return the number of elements in the list" in {
//    P04.length(list) shouldBe 6
//  }
//
//  it should "reverse the list" in {
//    P05.reverse(list) shouldBe List(8, 5, 3, 2, 1, 1)
//  }
//
//  it should "find out whether it is a palindrome" in {
//    val list = List(1, 2, 3, 2, 1)
//    P06.isPalindrome(list) shouldBe true
//  }
//
//  it should "flatten a nested list structure" in {
//    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)
//  }
//
//  it should "eliminate consecutive duplicates of list elements" in {
//    P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
//  }
//
//  it should "pack consecutive duplicates of list elements into sublists" in {
//    P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
//      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
//  }
//
//  it should "run-length encoding of a list." in {
//    P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
//      List[(Int, Symbol)] = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
//
//  }

}
