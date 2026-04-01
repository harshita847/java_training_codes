
import java.util.Scanner;

public class function {
    // function to add two numbers
    public static int add(int a,int b) {
        return a+b;
        
    }
    // function to calculate frequency of number
    public static int freq(int a,int d){
        int count=0;
        while(a>0){
            int n=a%10;
            if(n==d){
                count++;
                
            }
            a=a/10;
        } 
        return count;

    }
    public static int convert(int x,int y) {
        int c=0;
        while(x>0){
            int rem=x%y;
                  rem=rem/2;
                   c=(c*10)+rem;
        }
        
        return c;
        
    }

        
    
    public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                // int a=sc.nextInt();
                // int b=sc.nextInt();
                // int sum=add(a,b);
                // int occurence=freq(a,9);
                 int p= convert(10,2);
                // System.out.println(occurence);
                 System.out.println(p);
    }
}

