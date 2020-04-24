//WAP to calculate area of rectangle where length=10cm and breadth=20cm.
class Area_A
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
        Area_A obj=new Area_A();
        obj.init();
        obj.calc();
        obj.disp();
    }
}