class Date
{
    int d,m,y;
    Date(int d, int m, int y)
    {
        this.d=d;
        this.m=m;
        this.y=y;
    }
    Date()
    {
        d=12;
        m=8;
        y=2020;
    }
    void disp()
    {
        System.out.println(d+"/"+m+"/"+y);
    }
    public static void main()
    {
        Date obj1=new Date();
        Date obj2=new Date(14,6,2020);
        obj1.disp();
        obj2.disp();
    }
}