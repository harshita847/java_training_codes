//package lect-13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class q {
     public static void main(String[] args)
     {   ArrayList<Integer>list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);
        int target=14;
        
      ListIterator<Integer>it=list.listIterator();
    
         
         while(it.hasNext()<=target){
            Integer x=it.next();
            System.out.println(x);
               
    
            }
        //     while(it.hasPrevious()){
        //         Integer y=it.previous();
        //         if(y<target){
        //            it.remove();
        //         }
        //         System.out.println(y);
        //     }
        //   System.out.println(list);
    
}
     
     
    
}

