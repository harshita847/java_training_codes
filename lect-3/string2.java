

public class string2  {
    public static void main(String[] var0) {

          String str="java is programming lang";
          String a[]=str.split(" ");
          String largest="";
              
         for(String val:a)
         {
            if(val.length()>largest.length())
                      
            {  
                 largest=val;     
            }
         
           // System.out.println(str1);
        }
        System.out.println(largest);
    }    
}

    

