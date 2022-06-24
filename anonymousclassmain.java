abstract  class method
{
    abstract void m1();
}

public class anonymousclassmain
{
   public static void main(String[] args)
   {
        new method()
        {
            void m1()
            {
                System.out.println("m1 method of abstract class is called");
            }
        }.m1();
   }
}
//BEST LINK : https://www.javatpoint.com/anonymous-inner-class
