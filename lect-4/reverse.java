public class reverse {
    public static void main(String[] args){
     //StringBuilder str=new StringBuilder("i love java");
     String  str= "i love java";
     String a[]= str.split(" ");
     for(String val: a)
     {
       // System.out.println(val);
     
      StringBuilder str1=new StringBuilder(val);
      str1.reverse();
       System.out.print(str1);
       System.out.print(" ");


    }
}
}