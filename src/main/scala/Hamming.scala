object Hamming extends App {

  def hamming(left: String, right: String): Option[Int] = {
    val leftSeq = left.toUpperCase.split("")
    val rightSeq = right.toUpperCase.split("")
    if (leftSeq.length == rightSeq.length) {
      Some(leftSeq
        .zip(rightSeq)
        .count { case (a, b) => a != b })
    }
    else None
  }
}