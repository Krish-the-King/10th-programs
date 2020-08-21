import java.util.*;
class While_loop2
{
    int a;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
    }
    void calc()
    {
        int n=a,pro=1;
        while(n!=0)
        {
            pro*=n%10;
            n=n/10;
        }
        System.out.println(pro);
    }
    public static void main()
    {
        While_loop2 obj=new While_loop2();
        obj.init();
        obj.calc();
    }
}