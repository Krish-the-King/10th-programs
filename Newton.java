class Newton
{
    double S,u=20,t=20,a=10;
    void displacement()
    {
        S=(u*t)+((1/2)*a*t*t);
    }
    void disp()
    {
        System.out.println(S+"m");
    }
    public static void main()
    {
        Newton obj=new Newton();
        obj.displacement();
        obj.disp();
    }
}