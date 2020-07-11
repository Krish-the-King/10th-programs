class Calc
{
    int a, b;
    char c;
    Calc(int a1, int b1, char c1)
    {
        a=a1;
        b=b1;
        c=c1;
    }
    void Calculate()
    {
        if(c=='+')
        System.out.println(a+b);
        else if(c=='-')
        System.out.println(a-b);
        else if(c=='*')
        System.out.println(a*b);
        else if(c=='/')
        System.out.println(a/b);
        else
        System.out.println("Wrong charecter");
    }
    public static void main(int a, int b, char c)
    {
        Calc obj=new Calc(a,b,c);
        obj.Calculate();
    }
}