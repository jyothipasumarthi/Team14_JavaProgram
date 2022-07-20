//compiletime polymorphism
class Parent {
    void sub() {
        System.out.println("Iam in method");
    }
}
class Child extends Parent {
    void sub(int a,int b) {
        System.out.println(a-b);
    }
}
public class CheckInHeritance {
    public static void main(String[] args) {
        Child c=new Child();
        c.sub();
        c.sub(20,5);
    }
}