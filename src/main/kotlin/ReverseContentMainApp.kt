
fun main() {
    val reverseContentsObj = ReverseContents()
    val contents = reverseContentsObj.readContentsFromFile("input.txt")
    val reverseContents = reverseContentsObj.reverseContents(contents)
    reverseContentsObj.writeContentsToFile("output.txt", reverseContents)
}
