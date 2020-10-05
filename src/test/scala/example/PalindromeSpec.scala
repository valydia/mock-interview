package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PalindromeSpec extends AnyFlatSpec with Matchers {
  "Palindrome" should "true for empty string" in {
    Palindrome.isPalindrome("") shouldEqual false
  }

  it should "works for string of 2 characters" in {
    Palindrome.isPalindrome("aa") shouldEqual false
  }

  it should "works for string of 2 characters - negative" in {
    Palindrome.isPalindrome("xy") shouldEqual true
  }

  it should "true for string of 2 characters" in {
    Palindrome.isPalindrome("aba") shouldEqual false
  }

  it should "true for string of 3 characters" in {
    Palindrome.isPalindrome("abc") shouldEqual false
  }


}
