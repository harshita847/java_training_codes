import java.io.File;

public class delete {
    static void deletedata(){
        try{
            File file=new File("new.java");
            if(file.delete()){
                System.out.println("file is deleted");
            }
            else{
                System.out.println("file is not deleted");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
public static void main(String[] args){

         deletedata();
}
}
