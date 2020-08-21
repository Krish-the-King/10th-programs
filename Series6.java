import java.util.*;
class Series6
{
    int S=0,n,x;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for n");
        n=sc.nextInt();
    }
    void calc()
    {
        for(int i=2;i<=n;i+=2)
        {
            if(i%4==0)
            S-=fact(i);
            else
            S+=fact(i);
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
        Series6 obj=new Series6();
        obj.init();
        obj.calc();
    }
}