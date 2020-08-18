import java.util.*;
class Series
{
    double a,n,sum=0;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        n=sc.nextDouble();
        double ans1=function(n);
        double ans2=function(n,a);
        disp(ans1,ans2);
    }
    double function(double n1)
    {
        for(int i=(int)n1;i>1;i++)
        {
            sum+=(1/i);
        }
        System.out.println();
        return(sum);
    }
    double function(double n1)
    {
        sum=0;
        for(int i=2;y>=n1;i+=3)
        {
            sum+=(1/Math.pow(a,i);
        }
        return(sum);
    }
    void disp(double ans1, double ans2)
    {
        System.out.println(ans1+"\n"+ans2);
    }
    public static void main()
    {
        Series obj=new Series();
        obj.init();
    }
}