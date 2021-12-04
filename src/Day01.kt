fun main() {

    fun part1(input: List<Int>): Int {
        return input.zipWithNext().count { (i1, i2) -> i2 > i1 }
    }

    fun part2(input: List<Int>):Int {
        return input.windowed(3).zipWithNext().count{(l1, l2) -> l1.sum() < l2.sum()}
    }

    // test if implementation meets criteria from the description, like:
    // Read the file, create as an array of ints
    val input = readInputAsInts("Day01")
    println(part1(input))
    println(part2(input))

}



