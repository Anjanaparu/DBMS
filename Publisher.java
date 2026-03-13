import java.util.Scanner;
import java.util.Locale.Category;

public class Publisher {
    String pubName;
    publisher(String pub)
    {
        PubName=pub;
    }}
    class Book extends Publisher
    {
        String book;
        Book(String pub,String bk)
        {
            super(pub);
            book=bk;
        }}
        class Literature extends Book{
            String category;
            Literature(String pub,String bk,String ctgry)
            {
                super(pub,bk);
                category-ctgry;
            }
            void display()
            {
                System.out.println("Publisher:"+pubName);
                System.out.println("Book:"+book);
                System.out.println("Category:"+category);
            }
            }
            class Fiction extends Book
            {
                String caString;
                Fiction(String pub,String bk,String ctgry)
                {
                    super(pub,bk);
                    Category=ctgry;
                }
                void display(){
                    System.out.println("Publisher:"+pubName);
                    System.out.println("Book:"+book);
                    System.out.println("Category:"+Category);
                }}
                public class BookDetails
                {
                    public static void main(String[]args)
                    {
                        Scanner s=new Scanner(System.in);
                        System.out.println("enter  Literature Book Details");
                        System.out.println("Book name");
                        String b= s.next();
                        System.out.println("Publisher");
                        String pub =s.next();
                        System.out.println("Category");
                        String c=s.next();
                        Literature ob1=new Literature(b,pub,c);
                        
                        System.out.println("Enter Fiction Book Details");
                        System.out.println("Book name");
                        String b1=s.next();
                        System.out.println("Publisher");
                        String p1=s.next();
                        System.out.println("Category");
                        String c1 =s.next();
                        Fiction ob2=new FIction(b1,p1,c1);

                        System.out.println("\n** Literature Book**");
                        System.out.println("-------------------");
                        ob1.display();

                        System.out.println("\n**Fiction Book**");
                        System.out.println("--------------");
                        ob2.display();
                        s.close();}}


            
        
            
    
