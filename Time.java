class Time
{
    double hr, min, sec;
    void accept(double hr1, double min1, double sec1)
    {
        hr=hr1;
        min=min1;
        sec=sec1;
    }
    double convert()
    {
        double ans=hr*3600+min*60+sec;
        return(ans);
    }
    void show_Result()
    {
        System.out.println(convert());
    }
    public static void main(double hr1, double min1, double sec1)
    {
        Time obj=new Time();
        obj.accept(hr1,min1,sec1);
        obj.convert();
        obj.show_Result();
    }
}