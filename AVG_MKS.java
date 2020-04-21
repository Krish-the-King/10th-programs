class AVG_MKS
{
    int chem,comp,maths;
    double avg;
    void init()
    {
        chem=100;
        comp=99;
        maths=100;
    }
    void calc()
    {
        double sum=(double) (chem + comp + maths);
        avg = sum/3;
    }
    void disp()
    {
        System.out.print("The avg marks are " + avg);
    }
}