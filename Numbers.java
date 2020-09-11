import java.util.*;
class Numbers
{
    int n,count=0;
    void init(int n1)
    {
        n=n1;
    }
    void calc()
    {
        int i=1;
        do
        {
            if(n%i==0)
            {
                count+=i;
            }
            i++;
        }while(n>=i);
    }
    void disp()
    {
        if(count<2*n)
        System.out.println("The number is deficient");
        else if(count==2*n)
        System.out.println("The number is perfect");
        else if(count>2*n)
        System.out.println("The number is abundant");
    }
    public static void main(int n)
    {
        Numbers obj=new Numbers();
        obj.init(n);
        obj.calc();
        obj.disp();
    }
}