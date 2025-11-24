// abstraction 
abstract class animal{

   abstract void eat();
}
class cat extends animal{
    void eat(){
        System.out.println("cat food");
    }
}
public class abstraction {
    public static void main(String[] args){
        cat s1= new cat();
        s1.eat();
    
}
}