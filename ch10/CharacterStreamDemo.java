import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException{
        var reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        var line = reader.readLine();

        var writer = new PrintWriter(System.out, true);
        writer.println(line);
    }    
}
