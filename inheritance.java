class A {
    void show() { System.out.println("A"); }
}

class B extends A {
    void display() { System.out.println("B"); }
}

public class inheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}


