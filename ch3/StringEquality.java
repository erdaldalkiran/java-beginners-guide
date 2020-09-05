public class StringEquality {
    public static void  main (String[] args)    {
        var literal1 =  "ciko";
        var literal2 = "ciko";
        if(literal1.equals(literal2)){
            System.out.println("literal1.equals(literal2)");
        }
        if(literal1 == literal2){
            System.out.println("literal1 == literal2");
        }

        var obj1 =  new String("ciko");
        var obj2 =  new String("ciko");
        if(obj1.equals(obj2)){
            System.out.println("obj1.equals(obj2)");
        }
        if(obj1 == obj2){
            System.out.println("obj1 == obj2");
        }


        if(obj1.equals(literal1)){
            System.out.println("obj1.equals(literal1)");
        }
        if(obj1 == literal1){
            System.out.println("obj1 == literal1");
        }
    }
}
