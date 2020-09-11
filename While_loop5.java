import java.util.*;
class While_loop5
{
    int n;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void calc()
    {
        int min=n%10,max=n%10,t;
        while(n!=0)
        {
            t=n%10;
            if(t<min)
            min=t;
            else if(t>max)
            max=t;
            n=n/10;
        }
        System.out.println("min="+min+"\nmax="+max);
    }
    public static void main()
    {
        While_loop5 obj=new While_loop5();
        obj.init();
        obj.calc();
    }
}