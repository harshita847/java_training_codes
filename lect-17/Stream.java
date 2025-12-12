//package lect-17;
import java.util.*;
//stream= no concept of index

public class Stream {
    public static void main(String[] args){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(10);
         List.add(-20);
         List.add(30);
         List.add(40);
         List.add(50);
         // filter
        List<Integer>newlist= List.stream().filter(n->n>30).toList();
        System.out.println(newlist);
        //map

         List<Integer>res= List.stream().map(n->n*2).toList();
        System.out.println(res);
        //skip

        List<Integer>skip= List.stream().skip(2).toList();
         System.out.println(skip);
         //limit

        List<Integer>limit= List.stream().limit(2).toList();
         System.out.println(limit);

         // sort
         List<Integer>sort= List.stream().sorted((a,b)->a-b).toList();
         System.out.println(sort);

         // reduce
        int data= List.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);

    }
}
