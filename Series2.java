import java.util.*;
class Series2
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
        for(int i=1;i<=n;i++)
        {
            S+=(Math.pow(x,i)/fact(i));
        }
        System.out.println(S);
    }
    int fact(int i)
    {
        int a=1;
        for(int j=i;j>0;j--)
        {
            a*=j;
        }
        return(a);
    }
    public static void main()
    {
        Series2 obj=new Series2();
        obj.init();
        obj.calc();
    }
}