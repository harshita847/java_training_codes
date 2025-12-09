import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
// in iterator only forward and we cannot modify data

public class iterator{
    public static void main(String[] args)
     {   ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
         list.add(30);
          list.add(40);
          Iterator<Integer>it=list.iterator();
          while(it.hasNext()){
           // System.out.println(it.next());
            if(it.next()==20){
                it.remove();
            }
           
          }
           System.out.println(list);

     }

     // list iterator=travels forward as well as backward
    }