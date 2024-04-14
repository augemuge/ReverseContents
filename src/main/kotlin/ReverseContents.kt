import java.io.File

class ReverseContents {
    // Reads contents from file
    fun readContentsFromFile(filePath: String): String {
        return File(filePath).readText()
    }

    // Reverses contents
    fun reverseContents(contents: String): String {
        return contents.reversed()
    }

    // Writes contents to file
    fun writeContentsToFile(filePath: String, content: String) {
        File(filePath).writeText(content)
    }

}