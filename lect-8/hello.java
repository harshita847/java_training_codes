//package lect-8;

// constructor is made only for class having class keyword
// constructor is not possible for interface
interface A
{                     // method will be abstact whether we write it or not
    void eat();
}
interface B
{                     // method will be abstact whether we write it or not
    void eat();
}
class C  implements A,B
{
   public void eat(){
    System.out.print("hello");
   }
}



public class hello {

    public static void main(String[] args){
 
    C s1=new C();
    s1.eat();
}
}
