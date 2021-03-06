package binPacking.d1

import binPacking.d1.solver.greedy.FirstFit

object FirstFitTest extends App {
  val i1 = Instance.uniform(0, 100, 10)
  Test.run(FirstFit, i1)

  val i2 = i1.clone()
  scala.util.Sorting.quickSort[Int](i2.items)(Ordering[Int].reverse)
  Test.run(FirstFit, i2)

  val i3 = Instance(10, Array(8, 5, 7, 6, 2, 4, 1))
  Test.run(FirstFit, i3)
}
