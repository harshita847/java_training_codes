public class typecasting {
    public static void main(String[] args)
    {
        // byte a=5;
        // short b=a;   // automatic typecasting
        // int c=b;
        short a=13;
        byte b=(byte)a;     // forcefull typecasting chances of data loss
        System.out.println(b);

        // to create string 
        String str="harshita";
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // to print reverse of string
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        
        // strings are immutable - cannot be changed
        
      
    }
    
}
