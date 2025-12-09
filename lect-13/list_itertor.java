//package lect-13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class list_itertor{
    public static void main(String[] args)
     {   ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        list.add(2);
          list.add(3);
          ListIterator<Integer>it=list.listIterator();
          //list iterator=travels forward as well as backward
    
          while(it.hasNext()){
             Integer x=it.next();
           // System.out.println(it.next());
           if(x==10){
            it.add(100);}
            if(x==30){
                it.set(90);}
                if(x %2!=0){
                    it.set(-1);
                }
            }
           
            
          // System.out.println(x);

          
         // System.out.println(x);
           System.out.println(list);

     }
    }
    

     // list iterator=travels forward as well as backward
    


