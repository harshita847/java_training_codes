// Create an abstract class 'Shape' with an abstract method 'area()'.
// Implement two subclasses
 //'Circle' and 'Rectangle'. 
abstract class shape{
    abstract float area(float r,float pi);
}

 class circle extends shape{
  float area(float a,float b){
       float area_of_circle = a*a*b;

       return area_of_circle;


   }

}
class rectangle extends shape{
  float area(float a,float b){
       float area_of_rectangle=a*b;

       return area_of_rectangle;


   }
}
  public class ques{
 public static void main(String[] args){
    circle c1=new circle();
    float x = c1.area(14.4f, 3.1f);
    System.out.println(x);

 }
}

    
