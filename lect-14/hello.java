//package lect-14;
import java.util.ArrayList;
import java.util.Iterator;
// in iterator only forward and we cannot modify data

public class hello{
    public static void main(String[] args)
     {   ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
         list.add(30);
          list.add(40);
           list.add(4);
            list.add(2);

          Iterator<Integer>it=list.iterator();
          int l= list.size();
         System.out.println(l);
         int mid=l/2;
         System.out.println(mid);

          while(it.hasNext()){
            Integer x=it.next();
            //if(x==mid)
         System.out.println(x);
        //     if(it.next()==20){
        //         it.remove();
        //     }
           
        //  }
           System.out.println(list);

 }
     }
    }

     
