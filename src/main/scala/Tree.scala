object Tree extends App{
  /**
   * Prints Xmas tree with a user defined height
   * If a height is not defined, prints 3-line-high Xmas tree
   */

  val treeHeight: Int =
    if(!args.isEmpty)
      args(0).toInt
    else
      3

  var numberOfSpaces: Int = treeHeight - 1
  for (i <- 1 to treeHeight * 2 by 2) {
    println(" " * numberOfSpaces + "*" * i)
    numberOfSpaces -= 1
  }

}
