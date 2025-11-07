public class string {
    
    public static void main(String[] args)
    {   String str=" hello world ";       // one way to create string
        System.out.println(str.length());    //13
        System.out.println(str.charAt(1)); //h
        System.out.println(str.trim());   // hello world
       // System.out.println(str.length()); 11
        System.out.println(str.toUpperCase()); // HELLO WORLD
        System.out.println(str.toLowerCase()); // hello world
        System.out.println(str.substring(1));  //hello world
        System.out.println(str.substring(1,3));  //he
        System.out.println(str.indexOf('h')); //1
        
         // conecpt of equality in string

         // another way to create string
           String str1=new String("hello");
           String str2=new String("hello");    // objects are created
           System.out.println(str1==str2);     // comparing two different ojects [false]
           // false because- address of both string are different
           System.out.println(str1.equals(str2)); // compares the data inside the string [true]

           // to check whether a string is palindrome or not
           String a="mom";
           String b="";
           for(int i= a.length()-1;i>=0;i--)
           {
               b+=a.charAt(i);
           }
           if(a.equals(b))
           {
            System.out.println("it is a palindrome");
           }
           else
           {
            System.out.println("it is not a palindrome");
           }

           


    }
}

