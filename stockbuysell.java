import java.util.*;
public class stockbuysell
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,ArrayList<Integer>>  hm = new HashMap<Integer,ArrayList<Integer>>();
        int greater =arr[0];int pos =0;
        for(int i=0;i<n-1;i++)
        {
            System.out.println("for entry");
            System.out.println("i :"+i);
            if(arr[i] > arr[i+1])
            {
                ArrayList<Integer> al = new ArrayList<Integer>();
                System.out.println(pos+" "+i);
                al.add(0,pos);
                if(i+1==1)
                {
                    al.add(1);
                    hm.put(Math.abs(arr[pos]-arr[i+1]),al);
                }
                else
                {
                    al.add(i);
                    hm.put(Math.abs(arr[pos]-arr[i]),al);
                }

                greater = arr[i+1];
                pos=i+1;
            }
            if(i+1 == n-1)
            {
                if(greater < arr[i+1])
                {
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(0,pos);
                    al.add(1,i+1);
                    hm.put(Math.abs(arr[i+1]-greater),al);

                }
                else
                {
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(0,pos);
                    al.add(1,i);
                    hm.put(Math.abs(arr[i]-greater),al);
                }
                break;
            }
            System.out.println("hm :"+hm);

        }
        System.out.println(hm);
    }
}
