package binPacking.d1

import scala.collection.mutable.ArrayBuffer

class Solution(val bins: Array[Bin]) {
  override def toString: String =
    s"Solution(bins=${bins.mkString("(", ", ", ")")})"
}

object Solution {
  def apply(bins: Array[Bin]): Solution =
    new Solution(bins)

  def apply(bins: ArrayBuffer[Bin]): Solution =
    new Solution(bins.toArray)
}