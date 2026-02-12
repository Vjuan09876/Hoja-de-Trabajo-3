import org.junit.*;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.*;

public class FileHandlerTest {

    private FileHandler fileHandler;
    private final String testFile = "test_numbers.txt";

    @Before
    public void setUp() {
        fileHandler = new FileHandler();
    }

    @After
    public void tearDown() {
        File file = new File(testFile);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void generateRandomNumbersShouldCreateFileWithCorrectCount() throws IOException {
        fileHandler.generateRandomNumbers(testFile, 100);
        Integer[] numbers = fileHandler.readNumbers(testFile, 100);
        assertEquals(100, numbers.length);
    }

    @Test
    public void readNumbersShouldRespectLimit() throws IOException {
        fileHandler.generateRandomNumbers(testFile, 50);
        Integer[] numbers = fileHandler.readNumbers(testFile, 10);
        assertEquals(10, numbers.length);
    }

    @Test
    public void readNumbersShouldReturnEmptyArrayIfFileEmpty() throws IOException {
        fileHandler.generateRandomNumbers(testFile, 0);
        Integer[] numbers = fileHandler.readNumbers(testFile, 10);
        assertEquals(0, numbers.length);
    }
}
