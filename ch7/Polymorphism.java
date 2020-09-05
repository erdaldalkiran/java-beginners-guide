class A{
    void show(){
        System.out.println("Class A");
    }
}

class B extends A{
    int b  = 2;
    void show(){
        System.out.println("Class B " + b);
    }
}

class C extends A{
    int c  = 3;
    void show(){
        System.out.println("Class c " + c);
    }
}

class PolyMorphism{
    public static void main (String[] args){
        var a = new A();
        a.show();
        a = new B();
        a.show();
        a = new C();
        a.show();
    }
}