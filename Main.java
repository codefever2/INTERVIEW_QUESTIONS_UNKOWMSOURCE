
//1_5060021123127706115.pdf - filename in kaviya folder
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
        String  binary = sc.next();
        String output="";
        String result = "";
        int count =0;int maxcount=0;
        for(int i=0;i<binary.length()-1;i++)
        {
            if(binary.charAt(i) == binary.charAt(i+1))
            {
                count++;
                //System.out.println("count :"+count);
                if(count > maxcount)
                {
                   // System.out.println("if fi entry");
                    output += binary.charAt(i);
                    maxcount = count;
                    result=output;
                }
                count = 0;
                output="";
            }
            else
            {
                output += binary.charAt(i);
                if(i+1 == binary.length()-1)
                {
                    output += binary.charAt(i+1);
                    count++;
                }
                count++;
            }
        }
        if(count > maxcount)
        {
            result = output;
        }
        System.out.println(result);
    }
}