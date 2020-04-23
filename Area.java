class Area
{
    int l,b,area;
    void init()
    {
        l=10;
        b=20;
    }
    void calc()
    {
        area=l*b;
    }
    void disp()
    {
        System.out.println(area);
    }
    public static void main()
    {
        Area obj=new Area();
        obj.init();
        obj.calc();
        obj.disp();
    }
}