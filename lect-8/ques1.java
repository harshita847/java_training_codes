//package lect-8;
//  Create two interfaces Walkable and Runnable. 
// Each should have a method: walk() and run() respectively.
//  Then, create a class Human that implements both interfaces and defines both methods.
//  Create a main method where an object of Human is created and both methods are called.
interface walkable{
    void walk();
}
interface runnable{
    void run();
}
class human implements walkable,runnable{
    public void walk(){
        System.out.println("walk function");
    }
    public void run(){
        System.out.println("run function");
    }
}
//  public void take(){
//             Scanner sc= new Scanner(System.in);
//             int age =sc.nextInt();
//             System.out.println(age);
//         }
public class ques1 {
    public static void main(String[] args){
    human h1=new human();
    h1.walk();
    h1.run();
}
}
