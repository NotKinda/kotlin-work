// Task 5.1.1: main program
fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Please provide two words as command line arguments.")
        return
    }
    val word1 = args[0]
    val word2 = args[1]

    val result = anagrams(word1, word2)

    if (result) {
        println("'$word1' and '$word2' are anagrams!")
    } else {
        println("'$word1' and '$word2' are not anagrams.")
    }
}