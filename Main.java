//member inner class or normal nested class
class Test
{
    private int number = 5;
    int number1=10;
    static int number3 = 90;
    protected int number2 = 15;

    private void privatemethod()
    {
        System.out.println("private method is called");
    }
    public static void staticoutermethod()
    {
        System.out.println("staticoutermethod is called");
    }
    class Inner
    {
        void msg()
        {
            System.out.println("print the message");
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number);
            privatemethod();
            staticoutermethod();
        }
        static void stg()
        {
                System.out.println("print the message");
                System.out.println(number3);
//            System.out.println(number2);
//            System.out.println(number);
                staticoutermethod();
        }
        public static void staticmethod()
        {
            System.out.println("static method inside inner class");
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Test obj = new Test();
        Test.Inner in = obj.new Inner();
        in.msg();
        in.staticmethod();
        System.out.println(obj.number1);
        System.out.println(obj.number2);
        Test.Inner in1 = new Test().new Inner();
        in1.msg();
        in1.stg();
        in1.staticmethod();
//        Test.msg();
//        Test.staticmethod();
    }
}
//creating objects using both methods are same
//A normal nested class can access any access modifier variable/ methods from its outer class .
//Inner class can have static method and can be accessed from main method
//both