public class Bird {
    void fly(){
        System.out.println("I am flying");
    }    
}
public class Crow extends Bird
{
    void sound(){
         System.out.println("I am making sounds");
    }
}
class SingleInheritance {
    public static void main(String[] args) 
    {
        Crow c=new Crow();
        c.sound();
    }
}