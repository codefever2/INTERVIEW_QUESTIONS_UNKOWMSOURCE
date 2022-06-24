

//anonymous interface implementation
public interface Test1
{
public void m1();
}

class Test2
{
    public static void main(String[] args)
    {
        Test1 i = new Test1(){
            public void m1()
            {
                System.out.println("anonymous interface is called");
            }
        };
        i.m1();
    }
}
