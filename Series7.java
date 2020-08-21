import java.util.*;
class Series7
{
    int S=1,n,x;
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
            S+=(Math.pow(x,i)/fact(i+1));
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
        Series7 obj=new Series7();
        obj.init();
        obj.calc();
    }
}