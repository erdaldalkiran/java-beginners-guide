// ciko
class Example{
    public static void main(final String[] args) {
    
        printWhateverEmmreSays(args[0]);
        var ciko = 3;
        printWhateverEmmreSays(Integer.toString(ciko));
    }

    private static void printWhateverEmmreSays(String emreSays){
        System.out.println(emreSays);
    }
}