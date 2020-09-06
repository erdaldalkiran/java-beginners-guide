import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        FileInputStream fin;
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            return;
        }

        try {
            int b = fin.read();
            while (b != -1) {
                System.out.print((char) b);
                b = fin.read();
            }
        } catch (IOException ex) {
            System.out.println(ex);
            return;
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
