package pl.altkom;

class A {
    protected int x;
    public A(int x) {
        this.x = x;
    }
}

class B extends A {
    public B(int x) {
        super(x);
        this.x = x;
    }
}

public class ClassesExample1 {
    public static void main(String[] args) {
        A a = new A(3);
    }
}
