class Bird {
    void fly(){
        System.out.println("I am flying");
    }    
}
class Crow extends Bird
{
    void sound(){
         System.out.println("I am making sounds");
    }
}
public class SingleInheritance {
    public static void main(String[] args) 
    {
        Crow c=new Crow();
        c.sound();
        c.fly();
    }
}