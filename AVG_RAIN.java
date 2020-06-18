class AVG_RAIN
{
    double april,may,june,ans;
    AVG_RAIN()
    {
        april=12;
        may=14;
        june=8;
    }
    void calc()
    {
        ans=(april+may+june)/3.0;
    }
    void disp()
    {
        System.out.println("Raifall for April-\t"+april+"cm");
        System.out.println("Raifall for may-  \t"+may+"cm");
        System.out.println("Raifall for june- \t"+june+"cm");
        System.out.println("Average Rainfall- \t"+ans+"cm");
    }
    public static void main()
    {
        AVG_RAIN obj=new AVG_RAIN();
        obj.calc();
        obj.disp();
    }
}