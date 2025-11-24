//package lect-7;

class animal {
    void eat(){
        System.out.println("pizza");
    }
    void data(){
        System.out.println("hiii");
    }
    
}
class dog extends animal{

    void eat(){
        System.out.println("pizza");
    }
    void sleep(){
        System.out.println("hello");
    }
}
public class hello {
    public static void main(String[] args){

        animal s1=new dog(); // uppercasting
        s1.eat();
        dog s2=(dog)s1;  // lowercasting
        s2.sleep();
}
}
