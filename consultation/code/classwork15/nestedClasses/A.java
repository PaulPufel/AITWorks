package classwork15.nestedClasses;

interface Cook {
    void cooking();
}

public class A {
    class B {
    }  // inner class

    static class C {
    }  // static nested class

    void myMethod() {    // anon class
        Cook cook = new Cook() {
            @Override
            public void cooking() {
                System.out.println("Hello from anon class");

            }
        };
        Cook cook2 = () -> {   // lambda class
            System.out.println("Hello from lambda");
        };
        class D {
        }  // method class/local-method inner class
    }
}
