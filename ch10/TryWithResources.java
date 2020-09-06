import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (var fin = new FileInputStream(args[0])) {
            int b = fin.read();
            while (b != -1) {
                System.out.print((char) b);
                b = fin.read();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
