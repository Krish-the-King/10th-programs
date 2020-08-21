import java.util.*;
class While_loop3
{
    int a;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
    }
    void calc()
    {
        int n=a,sum=1,len=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
            len++;
        }
        System.out.println(sum/len);
    }
    public static void main()
    {
        While_loop3 obj=new While_loop3();
        obj.init();
        obj.calc();
    }
}