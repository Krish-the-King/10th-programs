class time
{
    int hrs,mins,ttlhrs,ttlmins;
    void input(int h1, int m1)
    {
        hrs=h1;
        mins=m1;
    }
    void addTime(time obj1,time obj2)
    {
        ttlmins=(obj1.mins+obj2.mins)%60;
        ttlhrs=obj1.hrs+obj2.hrs+((obj1.mins+obj2.mins)/60);
    }
    void disp()
    {
        System.out.println("The total time = "+ttlhrs+"hrs "+ttlmins+"mins");
    }
    public static void main()
    {
        time t1=new time();
        time t2=new time();
        time t3=new time();
        t1.input(2,50);
        t2.input(3,50);
        t3.addTime(t1,t2);
        t3.disp();
    }
}