class Simple_Interest2
{
    double p1,r1,t1,SI;
    void init(double p, double r, double t)
    {
        p1=p;
        r1=r;
        t1=t;
    }
    void calc()
    {
        SI=(p1*r1*t1)/100;
    }
    void disp()
    {
        System.out.println("The simple interest is " + SI);
    }
}
