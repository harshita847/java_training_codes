import java.util.ArrayList;
import java.util.Collection;


 class student implements Comparable<student>{
    String name;
    int rollno;

   public student(String name,int rollno){
        this.name=name;
        this.rollno= rollno;

    }
    public String toString(){

    }

}
public class hello{
    public static void main(String[] args){
        Arraylist<Student>list=new ArrayList<>();
        list.add(new Student(1,"om"));
        list.add(new Student(2,"ankit"));


        
    }
}