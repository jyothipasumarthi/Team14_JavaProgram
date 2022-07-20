class Transport {
    void travel() {
        System.out.println("I am travelling");
    }
}
class Shifting extends Transport {
    void shift() {
        System.out.println("luggage is shifting");
    }
}
class Transfer extends Transport {
    void move() {
        System.out.println("moving");
    }
}
class HInheritance {
    public static void main(String[] args) {
        Shifting s=new Shifting();
        Transfer t=new Transfer();
        s.shift();
        t.travel();
        t.move();
    }
}