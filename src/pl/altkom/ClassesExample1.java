package pl.altkom;

class A {
    final protected int x;
    public A() {
        this(0);
    }
    public A(int x) {
        this.x = x;
    }
    public void foo() {

    }
}

class B extends A {
    public B(int x) {
        super(x);
//        this.x = x;
    }

    @Override
    public void foo() {
        super.foo();
        final int a = 8;
    }
}

public class ClassesExample1 {
    public static void main(String[] args) {
        A a = new A(3);
    }
}
