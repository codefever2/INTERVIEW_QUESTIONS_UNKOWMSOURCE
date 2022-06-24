
class outer1
{
    private int x=10;
    public int y = 20;
    int z=30;
    protected int a = 40;

    private void o1()
    {
        System.out.println("o1 private method is called");
    }
    static void o2()
    {
        System.out.println("o2 static outer method is called");
    }
    public void m2()
    {
        class inner1
        {
            public static void m1()
            {
                System.out.println("Inside m2 static method inside inner class is called");
//                System.out.println(y);
                o2();
            }
            public void m3()
            {
                System.out.println("Inside m2 method inside inner class is called");
                System.out.println(y);
                System.out.println(x);
                System.out.println(a);
                o1();
                o2();
            }
            private void m4()
            {
                System.out.println("Inside m2 method inside inner class is called");
                System.out.println(y);
                System.out.println(x);
                System.out.println(a);
                o1();
                o2();
            }

        }
        inner1 one = new inner1();
        one.m1();
        one.m3();
        one.m4();
    }
}
public class Localmethodclassmain
{
    public static void main(String[] args)
    {
        outer1 outer = new outer1();
//        System.out.println(outer.x);
        outer.m2();

    }
}

//only static methods/variables can be accessed by inner static method of a class
//inner class instance creation is done within the method