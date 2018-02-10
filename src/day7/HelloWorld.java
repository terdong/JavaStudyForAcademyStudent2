package day7;

public class HelloWorld {

    int number;

    int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println(">>helloworld 객체 생성");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.number = 10;
        int result = helloWorld.add(helloWorld.number, 9);
        System.out.println("result = " + result);

        System.out.println(">>helloworld2 객체 생성");
        HelloWorld helloWorld2 = new HelloWorld();
        helloWorld.number = 99;
        result = helloWorld2.add(helloWorld.number, 1);
        System.out.println("result = " + result);

    }

}
