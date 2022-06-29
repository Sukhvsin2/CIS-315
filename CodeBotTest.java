import java.io.FileNotFoundException;

public class CodeBotTest {
    public static void main(String[] args) throws CompilationException, Exception {
        CodeBot c = new CodeBot();
        c.compile();
        CodeBot c2 = new CodeBot("Hello2", "public class { public static void main(String[] args) { System.out.println(\"hello, world\");}}");
        c2.compile();        
    }
}