package appfuncs.simplefuncs;
import appsupport.supportfuncs.SupportFuncs;

public class SimpleMathFuncs {
    
    public static int lcf(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        var min = a < b ? a: b;

        for (var i = 2; i <= min/2; i++) {
            if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b)){
                return i;
            }
        }

        return 1;
    }

    public static int gcf(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);    

        var min = a < b ? a: b;

        for (var i = min/2; i >= 2; i--) {
            if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b)){
                return i;
            }
        }

        return 1;
    }
}
