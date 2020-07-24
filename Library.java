class Library
{
          int acc_num;
          String title, author;
          Library()
          {
                    acc_num=000000;
                    title="";
                    author="";
          }
          void input(int acc_num1, String title1, String author1)
          {
                    acc_num=acc_num1;
                    title=title1;
                    author=author1;
          }
          void compute(int days)
          {
                    int fine=days*2;
                    System.out.println("The fine to be paid is "+fine+" rupees");
          }
          void display()
          {
                    System.out.println("Accession Number\tTitle\t\t\tAuthor");
                    System.out.println(acc_num+"\t\t"+title+"\t"+author);
          }
          public static void main(int acc_num1, String title1, String author1, int days)
          {
                    Library obj=new Library();
                    obj.input(acc_num1, title1, author1);
                    obj.compute(days);
                    obj.display();
          }
}
