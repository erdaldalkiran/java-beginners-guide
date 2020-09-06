import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args){
        var c = System.console();
        var line = c.readLine();
        System.out.println(line);
    }
}
