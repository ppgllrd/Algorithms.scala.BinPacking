package binPacking.d1

import scala.util.Random

class Instance(val binSize: Int, val items: Array[Int]) {
  require(items.forall(_ <= binSize), s"Instance: non-valid instance as at least on item is larger than bin size. $this")

  val numItems: Int = items.length

  override def clone(): Instance =
    new Instance(binSize, items.clone())

  override def toString: String =
    s"Instance(bin.size=$binSize, items=${items.mkString("(", ", ", ")")})"
}

object Instance {
  def apply(binSize: Int, items: Array[Int]): Instance =
    new Instance(binSize, items)

  def uniform(rnd: Random, binSize: Int, numItems: Int): Instance = {
    val items = new Array[Int](numItems)
    for(i <- 0 until numItems)
      items(i) = 1 + rnd.nextInt(binSize - 1)
    Instance(binSize, items)
  }

  def uniform(seed: Int, binSize: Int, numItems: Int): Instance =
    uniform(new Random(seed), binSize, numItems)
}


