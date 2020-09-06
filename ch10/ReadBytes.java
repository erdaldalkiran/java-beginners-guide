import java.io.IOException;

class ReadBytes {
    public static void main(String[] args) throws IOException{
        var  buff = new byte[10];
        System.out.println("enter some data!");
        var nb = System.in.read(buff);
        System.out.println("number of bytes read: "+ nb);
        System.out.println("read data:");
        for (var b : buff) {
            System.out.print((char)b);
        }
        System.out.println();
    }
}