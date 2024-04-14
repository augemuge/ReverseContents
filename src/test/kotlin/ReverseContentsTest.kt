import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertNotNull

class ReverseContentsTest{
    @Test
    fun readContentsTest() {
        val reverseContentsObj = ReverseContents()
        assertNotNull(reverseContentsObj)
    }

    @Test
    fun readContentsFromFileTest() {
        val reverseContentsObj = ReverseContents()
        assertNotNull(reverseContentsObj)
        val contents = reverseContentsObj.readContentsFromFile("input.txt")
        assertNotNull(contents)
    }


    @Test
    fun reverseContentsTest() {
        val reverseContentsObj = ReverseContents()
        assertNotNull(reverseContentsObj)
        val contents = reverseContentsObj.readContentsFromFile("input.txt")
        assertNotNull(contents)
        val reverseContent = reverseContentsObj.reverseContents(contents)
        assert("!dlrow ,olleH" ==  reverseContent)

    }

    @Test
    fun writeContentsToFile() {
        val reverseContentsObj = ReverseContents()
        assertNotNull(reverseContentsObj)
        reverseContentsObj.writeContentsToFile("test_output.txt", "!dlrow ,olleH")
        val contents = reverseContentsObj.readContentsFromFile("test_output.txt")
        assert("!dlrow ,olleH" ==  contents)
        File("test_output.txt").delete()
    }
}

