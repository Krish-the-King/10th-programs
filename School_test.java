//Q1. A school conducts three exams namely term 1 exams,term 2 exams and 
//final term exams. Final marks scored(weighted marks) are computed as 
//30% of term1 and term2 each’s marks + 40% of the final term marks. 
//Write a program to compute the weighted marks for a student who 
//cored 412 in first term, 423 in second term and 430 in third term. 
//Then compute the weighted percentage out of 500 marks.
//Use appropriate constructor functions.
class School_test
{
    double term1, term2, final_term, weighted_mks,percentage;
    String name;
    School_test(String name1)
    {
        term1=412.0;
        term2=423.0;
        final_term=430.0;
        name=name1;
    }
    void total_marks()
    {
        weighted_mks=(30.0/100.0*term1)+(30.0/100.0*term2)+(40.0/100.0*final_term);
    }
    void percentage()
    {
        percentage=(weighted_mks/500)*100;
    }
    void disp()
    {
        System.out.println("The total percentage of "+name+" is "+percentage+".");
        System.out.println("Marks of term 1="+term1+"\nMarks of term 2="+term2+"\nMarks of final term="+final_term);
        System.out.println("Weighted marks="+weighted_mks);
    }
    public static void main(String name)
    {
        School_test obj=new School_test(name);
        obj.total_marks();
        obj.percentage();
        obj.disp();
    }
}