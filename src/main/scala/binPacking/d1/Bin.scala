package binPacking.d1

import scala.collection.mutable.ArrayBuffer

case class Bin(size: Int) {
  private var capacityLeft = size
  private val items = new ArrayBuffer[Int]()

  def insert(item: Int):Unit = {
    require(capacityLeft >= item, s"Bin.insert: cannot insert $item in $this")
    items += item
    capacityLeft -= item
  }

  def capacity: Int = capacityLeft

  override def toString: String =
    s"Bin(capacity=$capacityLeft, items=${items.mkString("(", ", ", ")")})"
}
