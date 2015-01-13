import example.FooBar;

public class HelloWorld {
    public static void main(String[] args) {
        FooBar fb = new FooBar();

        System.out.println("Hello World!");
        System.out.println(fb.getFoo()+fb.getBar());
    }
}
