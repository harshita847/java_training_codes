// lect-13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class ques {
     public static void main(String[] args)
     {   ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
          list.add(6);
          list.add(7);
          ListIterator<Integer>it=list.listIterator();
         int l= list.size();
         System.out.println(l);
         int mid=l/2;
         System.out.println(mid);
         while(it.hasNext() && it.nextIndex()<=mid){
            Integer x=it.next();
            System.out.println(x);
         }
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }
        
     }
    }
         