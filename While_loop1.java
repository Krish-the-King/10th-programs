import java.util.*;
class While_loop1
{
    int a;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
    }
    void calc()
    {
        int n=a,sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main()
    {
        While_loop1 obj=new While_loop1();
        obj.init();
        obj.calc();
    }
}