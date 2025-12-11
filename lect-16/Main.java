//package lect-16;
 class threading extends Thread {
    public void run(){
          System.out.println(Thread.currentThread().getName());
          for(int i=0;i<=5;i++){
          System.out.println("downloading file-" + (i*20) + "%"); 

          try{
          Thread.sleep(1000);
          }

          catch(Exception e){
            System.out.println(e);
          }

    }
}
 }
class Main{
    public static void main(String[] args){
        threading t1=new threading();
        for(int i=0;i<=5;i++){
          System.out.println(i+"timer");
          
          try{
          Thread.sleep(1000);
          }
          
          catch(Exception e){
            System.out.println(e);
          }
        }

         t1.start();
        // // for(int i=0;i<5;i++){
        // //   System.out.println(i+"main");
        // //   }
         try{
        t1.join();}
        catch(Exception e){

        System.out.println(e);
         }
        // for(int i=0;i<5;i++){
        //   System.out.println(i+"main");
        //   }
    }
}

