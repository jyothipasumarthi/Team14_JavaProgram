class Vehicle {
    void move(String name) {
        System.out.println(name);
    }
}
class Bike extends Vehicle {
    void move(String name) {
        System.out.println(name);
    }
}
class Overriding {
    public static void main(String[] args) {
       Bike b=new Bike();
        b.move("jyo");
        Vehicle v=new Vehicle();
        v.move("prassu");
        
    }
}