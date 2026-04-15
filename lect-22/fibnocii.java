public class fibnocii{
      public static int f(int n){
        if(n==1)
            return 1;
        if(n==0)
            return 0;

        return f(n-1)+f(n-2);
      }
      

    public static void main(String[] args){
        int n=9;
        System.out.println(f(n));
    }

}