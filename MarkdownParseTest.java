import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.*;
import java.util.*;
import java.io.IOException;
import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void MarkdownParseTest0() throws IOException {
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest1() throws IOException {
        String content = Files.readString(Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file2.md"));
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest2() throws IOException {
        String content = Files.readString(Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file3.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest3() throws IOException {
        String content = Files.readString(Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file4.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest4() throws IOException {
        String content = Files.readString(Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file5.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest5() throws IOException {
        String content = Files.readString(Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file6.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest6() throws IOException {
        String content = Files.readString(Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file7.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest7() throws IOException {
        String content = Files.readString(Path.of("/Users/summerpines/Documents/GitHub/lab7-review-markdownparse/test-file8.md"));
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(content));
    }
    
}

