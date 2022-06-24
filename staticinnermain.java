class outer
{
    private int min=10;
    static int max = 20;
    public int x=30;
    protected int y=40;
    public static void outerstaticmethod()
    {
        System.out.println("outer static method is called");
    }
     static class inner
    {
        static void innerstaticmethod()
        {
            System.out.println("inner static method is called");
            System.out.println(max);
//            System.out.println(min);
//            System.out.println(x);
//            System.out.println(y);
            outerstaticmethod();
        }
        public void innerm1()
        {
            System.out.println("Inner m1 method of inner class is called");
            System.out.println(max);
//            System.out.println(min+x+y);
           outerstaticmethod();
        }
    }
}
public class staticinnermain
{
    public static void main(String[] args)
    {
        outer j = new outer();
        j.outerstaticmethod();
        outer.outerstaticmethod();
//        j.innerstaticmethod();
//        j.innerm1();
        outer.inner i = new outer.inner();
        i.innerm1();
        i.innerstaticmethod();
    }
}
//only one instance creation is available
//static inner class can access only static variables/methods of outer class
//a static inner class can have static methods inside.
//static method of inner class can access only static variables/methods of outer class
