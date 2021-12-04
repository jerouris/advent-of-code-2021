fun main() {

    fun part1(input: List<Int>): Int {
        return input
            .zipWithNext() // Create the pairs for comparison
            .count { (i1, i2) -> i2 > i1 } // compare and count the successful comparisons
    }

    fun part2(input: List<Int>):Int {
        return input
            .windowed(3) // create 3-element windows
            .zipWithNext() // create the pairs for comparison
            .count{(l1, l2) -> l1.sum() < l2.sum()} // compare the 3-element sums and return count
    }

    // Read the file, create as an array of ints
    val input = readInputAsInts("Day01")
    println(part1(input))
    println(part2(input))
}



