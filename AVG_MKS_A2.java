//WAP to calculate the avg marks of a student for scores of 3 subjects using interactive input
class AVG_MKS_A2
{
    int chem1,comp1,maths1;
    double avg;
    void init(int chem, int comp, int maths)
    {
        chem1=chem;
        comp1=comp;
        maths1=maths;
    }
    void calc()
    {
        double sum=(double) (chem1 + comp1 + maths1);
        avg = sum/3;
    }
    void disp()
    {
        System.out.print("The avg marks are " + avg);
    }
}
