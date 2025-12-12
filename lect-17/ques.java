//package lect-17;
import java.util.*;

public class ques {
    public static void main(String[] args){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
         List.add(20);
         List.add(44);
         List.add(4);
         List.add(5);
         List.add(56);
         List.add(7);
        List<Integer>newlist= List.stream().filter(n->n>5).toList();
        System.out.println(newlist);
         List<Integer>res= newlist.stream().filter(n->n%2==1).toList();
        System.out.println(res);
        int data= res.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);
}
}
