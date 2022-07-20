class Jaanu {
    void activity(String name) {
        System.out.println("Iam dancing");
    }
}
class Aryan extends Jaanu {
    void activity(String name) {
        System.out.println("Iam singing");
    }
}
class Polymorphism {
    public static void main(String[] args) {
        Aryan a=new Aryan();
        a.activity =("Jyo");
        a.activity=("Prassu");
    }
}