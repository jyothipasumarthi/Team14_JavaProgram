public class Demo
{
    void sub()
    {
        int x=20,y=10,z;
        z=x-y;
        System.out.println("The value of z is "+z);

    }
    public static void main(String args[])
    {
        Demo dobj=new Demo();
        dobj.sub();
    }
}