//package lect-8;


// how to create interfaces


interface A
{                     // method will be abstact whether we write it or not
    void eat();
}
class B implements A
{
   public void eat(){
    System.out.print("hello");
   }
}



public class multiple_inheritance {

    public static void main(String[] args){
      B s1=new B();
      s1.eat();
}
}
