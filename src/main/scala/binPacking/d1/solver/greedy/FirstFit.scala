package binPacking.d1.solver.greedy

import binPacking.d1.solver.Solver
import binPacking.d1.{Bin, Instance, Solution}

import scala.collection.mutable.ArrayBuffer

object FirstFit extends Solver {
  def name = "FirstFit"

  def solve(instance: Instance): Solution = {
    val bins = new ArrayBuffer[Bin]()

    for (item <- instance.items) {
      var inserted = false
      val it = bins.iterator
      while (!inserted && it.hasNext) {
        val bin = it.next()
        if (bin.capacity >= item) {
          bin.insert(item)
          inserted = true
        }
      }
      if (!inserted) {
        val bin = Bin(instance.binSize)
        bin.insert(item)
        bins += bin
      }
    }

    Solution(bins)
  }
}
