import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class CodeBot{
    private String className;
    private String code;

    private void saveCode(){
        try {
            File f = new File("codeOutput.txt");
            if(f.exists()){
                System.out.println("File " + f.getName() + " alredy exisits.");
                System.exit(0);
            }
            PrintWriter pw = new PrintWriter(f);
            pw.println(code);
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    CodeBot(){
        className = "Hello";
        code = "public\nclass Hello { public static void main(String[] args){\nSystem.out.println(\"hello, world\");}}";
        saveCode();
    }
    CodeBot(String className, String code){
        this.className = className;
        this.code = code;
        saveCode();
    }
    public void compile() throws CompilationException{
        if(code.indexOf(className) == -1){
            throw new CompilationException("Class name must be found in code.");
        }else{
            System.out.println(className+".java has compiled successfully.");
        }
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getClassName() {
        return className;
    }
    public String getCode() {
        return code;
    }

}