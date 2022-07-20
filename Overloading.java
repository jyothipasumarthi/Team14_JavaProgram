class Operation {
    void add(int a,int b) {
        System.out.println(a+b);
    }
}
class Calculate extends Operation {
    void add(float j,float k) {
        System.out.println(j+k);
    }
}
class Overloading {
    public static void main(String[] args) {
        Calculate c=new Calculate();
       // c.add(10,20);
        c.add(1.2f,2.3f);
        Operation o=new Operation();
        o.add(10,20);
    }
}