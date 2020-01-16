package binPacking.d1

import binPacking.d1.solver.Solver

object Test {
  def run(solver: Solver, instance: Instance): Solution = {
    println(s"Solving $instance with ${solver.name} solver:")
    val sol = solver.solve(instance)
    println(sol)
    println
    sol
  }
}
