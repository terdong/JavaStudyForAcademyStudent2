package day11.constructor;

public class B {
    int s;
    int t;

    public B(int a, int b){
        s = a;
        t = b;
    }

    public B(){}
}

class TestB{

    public static void main(String[] args) {
        B b = new B(3, 4);

        B bb = new B();

        System.out.println("b.s = " + b.s);
        System.out.println("b.t = " + b.t);
    }

}
