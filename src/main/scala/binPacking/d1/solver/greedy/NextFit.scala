package binPacking.d1.solver.greedy

import binPacking.d1.solver.Solver
import binPacking.d1.{Bin, Instance, Solution}

import scala.collection.mutable.ArrayBuffer

object NextFit extends Solver {
  def name = "NextFit"

  def solve(instance: Instance): Solution = {
    val bins = new ArrayBuffer[Bin]()
    var capacityLeft = 0
    for (item <- instance.items) {
      if(item <= capacityLeft) {
        bins.last.insert(item)
        capacityLeft -= item
      } else {
        val bin = Bin(instance.binSize)
        bin.insert(item)
        capacityLeft = bin.capacity
        bins += bin
      }
    }
    Solution(bins)
  }
}
