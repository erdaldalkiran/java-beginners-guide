import java.io.IOException;

public class ThrowableDemo {
    public static void main(String[] args) {
        try {
            try {
                throw new ArithmeticException("ciko was here!");
            } catch (ArithmeticException ex) {
                System.out.println(ex);
                System.out.println("");
                ex.printStackTrace();
                throw ex;
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println("");
            ex.printStackTrace();
            throw ex;
        }
    }
}
