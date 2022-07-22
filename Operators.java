public class Operators
{
    void Arithmetic()
   {
       int x=10,y=5,z;
       z=x+y;
       System.out.println("z = "+z);
   }
   void Relational()
   {
       int a=15,b=34;
       if(a>=b)
        System.out.println("true");
       else if(a<=b)
        System.out.println("false");
       else
        System.out.println("true");  
   }
  void Logical()
   {
       int e=10,f=20,g=10;
       if(e>f&&f>g)
        System.out.println("true");
       else if(e<f||f<g) 
        System.out.println("false");
       else if(e!=g) 
        System.out.println("false");
       else 
        System.out.println("false"); 
   }
   public static void main(String args[])
   {
       Operators pobj=new Operators();
     pobj.Relational();
       pobj.Arithmetic();
     pobj.Logical();
   }

}