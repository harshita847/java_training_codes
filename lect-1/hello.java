import java.util.Scanner;   // scanner is class to take input from user 

public class hello {
    public static void main(String[] args)   // main function
    {  Scanner sc=new Scanner(System.in);

       System.out.print( "enter integer:");
       int a=sc.nextInt();

       System.out.print( "enter double:");
       Double b =sc.nextDouble();

       System.out.print( "enter string:");
       String c =sc.next();

       sc.nextLine();  
        System.out.print( "enter full line:");
       String d=sc.nextLine();
       
       System.out.println( "integer:" +a);
       System.out.println( "double:" +b);
       System.out.println( "string:" +c);
       System.out.println( "full word:" +d);



    }
    
}
