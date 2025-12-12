//package lect-17;
import java.util.*;

public class Stream {
    public static void main(String[] args){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(10);
         List.add(20);
         List.add(30);
         List.add(40);
         List.add(50);
        List<Integer>newlist= List.stream().filter(n->n>30).toList();
        System.out.println(newlist);
         List<Integer>res= List.stream().map(n->n*2).toList();
        System.out.println(res);
        int data= List.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);

    }
}
