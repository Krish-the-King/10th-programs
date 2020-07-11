class Number
{
    int a,b,c;
    Number(int a1, int b1, int c1)
    {
        a=a1;
        b=b1;
        c=c1;
    }
    void check()
    {
        if(a>b&&a>c)
        {
            if(b>c)
            {
                System.out.println("Smallest number="+c+"\nNext highest number="+b);
             }
            else
            {
                System.out.println("Smallest number="+b+"\nNext highest number="+c);
            }
            System.out.println("Highest number="+a);
        }
        if(b>a&&b>c)
        {
            if(a>c)
            {
                System.out.println("Smallest number="+c+"\nNext highest number="+a);
             }
            else
            {
                System.out.println("Smallest number="+a+"\nNext highest number="+c);
            }
            System.out.println("Highest number="+b);
        }
        if(c>b&&c>a)
        {
            if(b>a)
            {
                System.out.println("Smallest number="+a+"\nNext highest number="+b);
             }
            else
            {
                System.out.println("Smallest number="+b+"\nNext highest number="+a);
            }
            System.out.println("Highest number="+c);
        }
    }
    public static void main(int a, int b, int c)
    {
        Number obj=new Number(a,b,c);
        obj.check();
    }
}