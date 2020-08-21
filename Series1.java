import java.util.*;
class Series1
{
    int S=0,n,x;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for n");
        n=sc.nextInt();
        System.out.println("Enter a value for x");
        x=sc.nextInt();
    }
    void calc()
    {
        for(int i=0;i<=n;i++)
        {
            S+=(int)Math.pow(x,i);
        }
        System.out.println(S);
    }
    public static void main()
    {
        Series1 obj=new Series1();
        obj.init();
        obj.calc();
    }
}