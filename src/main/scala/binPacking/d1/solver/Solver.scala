package binPacking.d1.solver

import binPacking.d1.{Instance, Solution}

trait Solver {
  def name: String
  def solve(instance: Instance): Solution
}
