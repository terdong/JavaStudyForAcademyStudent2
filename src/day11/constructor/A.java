package day11.constructor;

public class A {

    int a;
    int b;
    int c;

    public A() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        a = 99;
        b = 99;
        c = 99;
    }

    public A(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class TestA{
    public static void main(String[] args) {
         A a = new A();
        System.out.println("a.a = " + a.a);
        System.out.println("a.b = " + a.b);
        System.out.println("a.c = " + a.c);

        A aa = new A(1,2,3);
        System.out.println("aa.a = " + aa.a);
        System.out.println("aa.b = " + aa.b);
        System.out.println("aa.c = " + aa.c);



    }
}