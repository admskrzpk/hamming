import Hamming.hamming
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.flatspec.AnyFlatSpec


class HammingSpec extends AnyFunSuite {

  test("program should count hamming distance in given two strings as long they are the same lenght") {
    val a = "GAGCCTACTAACGGGAT"
    val b = "CATCGTAATGACGGCCT"

    assert(hamming(a, b) == Some(7))
  }
  test("program should throw None if strings are not the same lenght") {
    val c = "CAGCCTACTAACGGGAT"
    val d = "CATCGTAATGACGGCCTF"

    assert(hamming(c, d) == None)
  }
}

