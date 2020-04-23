//WAP to calculate the avg marks of a student for scores of 3 subjects using non-interactive input
class AVG_MKS_A1
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