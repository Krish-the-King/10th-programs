//A man is paid the hourly rate(R) for the first 35 hours, he works in a 
//week. There after,  he is paid at 1.5 time that hourly rate(R) for the 
//next 25 hrs he works in a week, and at twice the hourly rate(R) for 
//the furhter 10 hrs in a week. He is not allowed to work for more than 
//70 hrs in a week.

//Taking the number of hours and the rate per hour as inputs, 
//the weekly wages ae to be calculated and printed. Write a java program 
//for the above situation and print the weekly wages.
import java.util.*;
class Banking
{
    double R,H,W;
    Banking()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rate");
        R=sc.nextDouble();
        System.out.println("Enter the No. of Hrs");
        H=sc.nextDouble();
    }
    void check()
    {
        if(H/35>=1)
        {
            W=1.0*R*35;
            hrs1();
        }
        else
        {
            W=1.0*R*H;
            disp();
        }
    }
    void hrs1()
    {
        if(H/60==1)
        {
            W+=1.5*R*25;
            hrs2();
        }
        else
        {
            W+=1.5*R*(H-35);
            disp();
        }
    }
    void hrs2()
    {
        if(H/70==1)
        {
            W+=2.0*R*10;
        }
        else
        {
            W+=2.0*R*(H-60);
        }
        disp();
    }
    void disp()
    {
        System.out.println("His wages is "+W+" rupees");
    }
    public static void main()
    {
        Banking obj=new Banking();
        if(obj.H>70)
        {
            obj.H=60;
        }
        obj.check();
    }
}